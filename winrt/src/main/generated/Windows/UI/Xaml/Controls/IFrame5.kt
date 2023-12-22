package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Interop.TypeName
import Windows.UI.Xaml.Navigation.FrameNavigationOptions
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IFrame5.ABI::class)
@Signature("{453fb92e-82b5-5f93-92ab-15341806c9da}")
@Guid("453fb92e82b55f9392ab15341806c9da")
@WinRTInterface("453fb92e82b55f9392ab15341806c9da")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFrame5.ByReference::class)
public interface IFrame5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsNavigationStackEnabled(): Boolean

  @InterfaceMethod(1)
  public fun put_IsNavigationStackEnabled(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun NavigateToType(
    sourcePageType: TypeName?,
    parameter: IUnknown?,
    navigationOptions: FrameNavigationOptions?
  ): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IFrame5> {
    public override fun getValue() = ABI.makeIFrame5(pointer.getPointer(0))

    public fun setValue(value: IFrame5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFrame5 {
    public val __368728964_Ptr: Pointer?

    public val _368728964_VtblPtr: Pointer?
      get() = __368728964_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsNavigationStackEnabled(): Boolean {
      val fnPtr = _368728964_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__368728964_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsNavigationStackEnabled(value: Boolean): Unit {
      val fnPtr = _368728964_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__368728964_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun NavigateToType(
      sourcePageType: TypeName?,
      parameter: IUnknown?,
      navigationOptions: FrameNavigationOptions?
    ): Boolean {
      val fnPtr = _368728964_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__368728964_Ptr, marshalToNative(sourcePageType),
          marshalToNative(parameter), marshalToNative(navigationOptions), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IFrame5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __368728964_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFrame5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("453fb92e82b55f9392ab15341806c9da")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFrame5(ptr: Pointer?): WithDefault = IFrame5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFrame5 {
      val address = segment.toRawLongValue()
      return makeIFrame5(Pointer(address))
    }

    public override fun toNative(obj: IFrame5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__368728964_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFrame5): Array<IFrame5?> = (elements as
        Array<IFrame5?>).castToImpl<IFrame5,IFrame5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFrame5?> = arrayOfNulls<IFrame5_Impl>(size) as
        Array<IFrame5?>
  }
}
