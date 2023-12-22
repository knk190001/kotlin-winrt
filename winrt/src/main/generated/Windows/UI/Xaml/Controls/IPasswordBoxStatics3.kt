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

@ABIMarker(IPasswordBoxStatics3.ABI::class)
@Signature("{a2cdd319-ad6a-4352-b590-f696ffcb8e3f}")
@Guid("a2cdd319ad6a4352b590f696ffcb8e3f")
@WinRTInterface("a2cdd319ad6a4352b590f696ffcb8e3f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPasswordBoxStatics3.ByReference::class)
public interface IPasswordBoxStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PasswordRevealModeProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_TextReadingOrderProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_InputScopeProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPasswordBoxStatics3> {
    public override fun getValue() = ABI.makeIPasswordBoxStatics3(pointer.getPointer(0))

    public fun setValue(value: IPasswordBoxStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPasswordBoxStatics3 {
    public val __73221314_Ptr: Pointer?

    public val _73221314_VtblPtr: Pointer?
      get() = __73221314_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PasswordRevealModeProperty(): DependencyProperty? {
      val fnPtr = _73221314_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__73221314_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_TextReadingOrderProperty(): DependencyProperty? {
      val fnPtr = _73221314_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__73221314_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_InputScopeProperty(): DependencyProperty? {
      val fnPtr = _73221314_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__73221314_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IPasswordBoxStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __73221314_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPasswordBoxStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a2cdd319ad6a4352b590f696ffcb8e3f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPasswordBoxStatics3(ptr: Pointer?): WithDefault = IPasswordBoxStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPasswordBoxStatics3 {
      val address = segment.toRawLongValue()
      return makeIPasswordBoxStatics3(Pointer(address))
    }

    public override fun toNative(obj: IPasswordBoxStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__73221314_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPasswordBoxStatics3): Array<IPasswordBoxStatics3?> =
        (elements as
        Array<IPasswordBoxStatics3?>).castToImpl<IPasswordBoxStatics3,IPasswordBoxStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPasswordBoxStatics3?> =
        arrayOfNulls<IPasswordBoxStatics3_Impl>(size) as Array<IPasswordBoxStatics3?>
  }
}
