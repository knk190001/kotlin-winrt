package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.DependencyObject
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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IControlProtected.ABI::class)
@Signature("{5c750339-1789-5095-a214-dd9d0564e579}")
@Guid("5c75033917895095a214dd9d0564e579")
@WinRTInterface("5c75033917895095a214dd9d0564e579")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IControlProtected.ByReference::class)
public interface IControlProtected : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DefaultStyleKey(): IUnknown?

  @InterfaceMethod(1)
  public fun put_DefaultStyleKey(value: IUnknown?): Unit

  @InterfaceMethod(2)
  public fun GetTemplateChild(childName: String?): DependencyObject?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IControlProtected> {
    public override fun getValue() = ABI.makeIControlProtected(pointer.getPointer(0))

    public fun setValue(value: IControlProtected_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IControlProtected {
    public val __348012184_Ptr: Pointer?

    public val _348012184_VtblPtr: Pointer?
      get() = __348012184_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DefaultStyleKey(): IUnknown? {
      val fnPtr = _348012184_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__348012184_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_DefaultStyleKey(value: IUnknown?): Unit {
      val fnPtr = _348012184_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__348012184_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun GetTemplateChild(childName: String?): DependencyObject? {
      val fnPtr = _348012184_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__348012184_Ptr, marshalToNative(childName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }
  }

  public class IControlProtected_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __348012184_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IControlProtected, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5c75033917895095a214dd9d0564e579")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIControlProtected(ptr: Pointer?): WithDefault = IControlProtected_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IControlProtected {
      val address = segment.toRawLongValue()
      return makeIControlProtected(Pointer(address))
    }

    public override fun toNative(obj: IControlProtected): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__348012184_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IControlProtected): Array<IControlProtected?> = (elements
        as Array<IControlProtected?>).castToImpl<IControlProtected,IControlProtected_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IControlProtected?> =
        arrayOfNulls<IControlProtected_Impl>(size) as Array<IControlProtected?>
  }
}
