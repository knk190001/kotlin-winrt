package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.DependencyProperty
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IToggleSwitchStatics.ABI::class)
@Signature("{1d37147f-97df-4226-92ca-ddf453d7fd5a}")
@Guid("1d37147f97df422692caddf453d7fd5a")
@WinRTInterface("1d37147f97df422692caddf453d7fd5a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IToggleSwitchStatics.ByReference::class)
public interface IToggleSwitchStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsOnProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_HeaderProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_HeaderTemplateProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_OnContentProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_OnContentTemplateProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_OffContentProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_OffContentTemplateProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IToggleSwitchStatics> {
    public override fun getValue() = ABI.makeIToggleSwitchStatics(pointer.getPointer(0))

    public fun setValue(value: IToggleSwitchStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IToggleSwitchStatics {
    public val __1085787807_Ptr: Pointer?

    public val _1085787807_VtblPtr: Pointer?
      get() = __1085787807_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsOnProperty(): DependencyProperty? {
      val fnPtr = _1085787807_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1085787807_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_HeaderProperty(): DependencyProperty? {
      val fnPtr = _1085787807_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1085787807_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_HeaderTemplateProperty(): DependencyProperty? {
      val fnPtr = _1085787807_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1085787807_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_OnContentProperty(): DependencyProperty? {
      val fnPtr = _1085787807_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1085787807_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_OnContentTemplateProperty(): DependencyProperty? {
      val fnPtr = _1085787807_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1085787807_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_OffContentProperty(): DependencyProperty? {
      val fnPtr = _1085787807_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1085787807_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_OffContentTemplateProperty(): DependencyProperty? {
      val fnPtr = _1085787807_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1085787807_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IToggleSwitchStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1085787807_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IToggleSwitchStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1d37147f97df422692caddf453d7fd5a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIToggleSwitchStatics(ptr: Pointer?): WithDefault = IToggleSwitchStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IToggleSwitchStatics {
      val address = segment.toRawLongValue()
      return makeIToggleSwitchStatics(Pointer(address))
    }

    public override fun toNative(obj: IToggleSwitchStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1085787807_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IToggleSwitchStatics): Array<IToggleSwitchStatics?> =
        (elements as
        Array<IToggleSwitchStatics?>).castToImpl<IToggleSwitchStatics,IToggleSwitchStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToggleSwitchStatics?> =
        arrayOfNulls<IToggleSwitchStatics_Impl>(size) as Array<IToggleSwitchStatics?>
  }
}
