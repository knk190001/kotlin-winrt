package Windows.UI.Input.Preview.Injection

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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IInjectedInputKeyboardInfo.ABI::class)
@Signature("{4b46d140-2b6a-5ffa-7eae-bd077b052acd}")
@Guid("4b46d1402b6a5ffa7eaebd077b052acd")
@WinRTInterface("4b46d1402b6a5ffa7eaebd077b052acd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInjectedInputKeyboardInfo.ByReference::class)
public interface IInjectedInputKeyboardInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_KeyOptions(): InjectedInputKeyOptions?

  @InterfaceMethod(1)
  public fun put_KeyOptions(value: InjectedInputKeyOptions?): Unit

  @InterfaceMethod(2)
  public fun get_ScanCode(): WinDef.USHORT

  @InterfaceMethod(3)
  public fun put_ScanCode(value: WinDef.USHORT): Unit

  @InterfaceMethod(4)
  public fun get_VirtualKey(): WinDef.USHORT

  @InterfaceMethod(5)
  public fun put_VirtualKey(value: WinDef.USHORT): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInjectedInputKeyboardInfo> {
    public override fun getValue() = ABI.makeIInjectedInputKeyboardInfo(pointer.getPointer(0))

    public fun setValue(value: IInjectedInputKeyboardInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInjectedInputKeyboardInfo {
    public val __1012376060_Ptr: Pointer?

    public val _1012376060_VtblPtr: Pointer?
      get() = __1012376060_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_KeyOptions(): InjectedInputKeyOptions? {
      val fnPtr = _1012376060_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InjectedInputKeyOptions>()
      val hr = fn.invokeHR(arrayOf(__1012376060_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InjectedInputKeyOptions>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_KeyOptions(value: InjectedInputKeyOptions?): Unit {
      val fnPtr = _1012376060_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1012376060_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ScanCode(): WinDef.USHORT {
      val fnPtr = _1012376060_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__1012376060_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_ScanCode(value: WinDef.USHORT): Unit {
      val fnPtr = _1012376060_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1012376060_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_VirtualKey(): WinDef.USHORT {
      val fnPtr = _1012376060_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__1012376060_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_VirtualKey(value: WinDef.USHORT): Unit {
      val fnPtr = _1012376060_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1012376060_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInjectedInputKeyboardInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1012376060_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInjectedInputKeyboardInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4b46d1402b6a5ffa7eaebd077b052acd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInjectedInputKeyboardInfo(ptr: Pointer?): WithDefault =
        IInjectedInputKeyboardInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInjectedInputKeyboardInfo {
      val address = segment.toRawLongValue()
      return makeIInjectedInputKeyboardInfo(Pointer(address))
    }

    public override fun toNative(obj: IInjectedInputKeyboardInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1012376060_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInjectedInputKeyboardInfo):
        Array<IInjectedInputKeyboardInfo?> = (elements as
        Array<IInjectedInputKeyboardInfo?>).castToImpl<IInjectedInputKeyboardInfo,IInjectedInputKeyboardInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInjectedInputKeyboardInfo?> =
        arrayOfNulls<IInjectedInputKeyboardInfo_Impl>(size) as Array<IInjectedInputKeyboardInfo?>
  }
}
