package Windows.UI.WindowManagement

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IWindowingEnvironment.ABI::class)
@Signature("{264363c0-2a49-5417-b3ae-48a71c63a3bd}")
@Guid("264363c02a495417b3ae48a71c63a3bd")
@WinRTInterface("264363c02a495417b3ae48a71c63a3bd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWindowingEnvironment.ByReference::class)
public interface IWindowingEnvironment : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsEnabled(): Boolean

  @InterfaceMethod(1)
  public fun get_Kind(): WindowingEnvironmentKind?

  @InterfaceMethod(2)
  public fun GetDisplayRegions(): IVectorView<DisplayRegion?>?

  @InterfaceMethod(3)
  public fun add_Changed(handler: TypedEventHandler<WindowingEnvironment?,
      WindowingEnvironmentChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_Changed(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWindowingEnvironment> {
    public override fun getValue() = ABI.makeIWindowingEnvironment(pointer.getPointer(0))

    public fun setValue(value: IWindowingEnvironment_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWindowingEnvironment {
    public val __1309788008_Ptr: Pointer?

    public val _1309788008_VtblPtr: Pointer?
      get() = __1309788008_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsEnabled(): Boolean {
      val fnPtr = _1309788008_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1309788008_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Kind(): WindowingEnvironmentKind? {
      val fnPtr = _1309788008_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WindowingEnvironmentKind>()
      val hr = fn.invokeHR(arrayOf(__1309788008_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WindowingEnvironmentKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetDisplayRegions(): IVectorView<DisplayRegion?>? {
      val fnPtr = _1309788008_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<DisplayRegion?>>()
      val hr = fn.invokeHR(arrayOf(__1309788008_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<DisplayRegion?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun add_Changed(handler: TypedEventHandler<WindowingEnvironment?,
        WindowingEnvironmentChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1309788008_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1309788008_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_Changed(token: EventRegistrationToken?): Unit {
      val fnPtr = _1309788008_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1309788008_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWindowingEnvironment_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1309788008_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWindowingEnvironment, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("264363c02a495417b3ae48a71c63a3bd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWindowingEnvironment(ptr: Pointer?): WithDefault =
        IWindowingEnvironment_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWindowingEnvironment {
      val address = segment.toRawLongValue()
      return makeIWindowingEnvironment(Pointer(address))
    }

    public override fun toNative(obj: IWindowingEnvironment): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1309788008_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWindowingEnvironment): Array<IWindowingEnvironment?> =
        (elements as
        Array<IWindowingEnvironment?>).castToImpl<IWindowingEnvironment,IWindowingEnvironment_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWindowingEnvironment?> =
        arrayOfNulls<IWindowingEnvironment_Impl>(size) as Array<IWindowingEnvironment?>
  }
}
