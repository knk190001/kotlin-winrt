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

@ABIMarker(IPasswordBoxStatics.ABI::class)
@Signature("{5ee67563-2d74-4ace-bd79-fcab61a7d77b}")
@Guid("5ee675632d744acebd79fcab61a7d77b")
@WinRTInterface("5ee675632d744acebd79fcab61a7d77b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPasswordBoxStatics.ByReference::class)
public interface IPasswordBoxStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PasswordProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_PasswordCharProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_IsPasswordRevealButtonEnabledProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_MaxLengthProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPasswordBoxStatics> {
    public override fun getValue() = ABI.makeIPasswordBoxStatics(pointer.getPointer(0))

    public fun setValue(value: IPasswordBoxStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPasswordBoxStatics {
    public val __833645969_Ptr: Pointer?

    public val _833645969_VtblPtr: Pointer?
      get() = __833645969_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PasswordProperty(): DependencyProperty? {
      val fnPtr = _833645969_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__833645969_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_PasswordCharProperty(): DependencyProperty? {
      val fnPtr = _833645969_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__833645969_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_IsPasswordRevealButtonEnabledProperty(): DependencyProperty? {
      val fnPtr = _833645969_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__833645969_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_MaxLengthProperty(): DependencyProperty? {
      val fnPtr = _833645969_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__833645969_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IPasswordBoxStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __833645969_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPasswordBoxStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5ee675632d744acebd79fcab61a7d77b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPasswordBoxStatics(ptr: Pointer?): WithDefault = IPasswordBoxStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPasswordBoxStatics {
      val address = segment.toRawLongValue()
      return makeIPasswordBoxStatics(Pointer(address))
    }

    public override fun toNative(obj: IPasswordBoxStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__833645969_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPasswordBoxStatics): Array<IPasswordBoxStatics?> =
        (elements as
        Array<IPasswordBoxStatics?>).castToImpl<IPasswordBoxStatics,IPasswordBoxStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPasswordBoxStatics?> =
        arrayOfNulls<IPasswordBoxStatics_Impl>(size) as Array<IPasswordBoxStatics?>
  }
}
