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

@ABIMarker(IInjectedInputMouseInfo.ABI::class)
@Signature("{96f56e6b-e47a-5cf4-418d-8a5fb9670c7d}")
@Guid("96f56e6be47a5cf4418d8a5fb9670c7d")
@WinRTInterface("96f56e6be47a5cf4418d8a5fb9670c7d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInjectedInputMouseInfo.ByReference::class)
public interface IInjectedInputMouseInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MouseOptions(): InjectedInputMouseOptions?

  @InterfaceMethod(1)
  public fun put_MouseOptions(value: InjectedInputMouseOptions?): Unit

  @InterfaceMethod(2)
  public fun get_MouseData(): WinDef.UINT

  @InterfaceMethod(3)
  public fun put_MouseData(value: WinDef.UINT): Unit

  @InterfaceMethod(4)
  public fun get_DeltaY(): Int

  @InterfaceMethod(5)
  public fun put_DeltaY(value: Int): Unit

  @InterfaceMethod(6)
  public fun get_DeltaX(): Int

  @InterfaceMethod(7)
  public fun put_DeltaX(value: Int): Unit

  @InterfaceMethod(8)
  public fun get_TimeOffsetInMilliseconds(): WinDef.UINT

  @InterfaceMethod(9)
  public fun put_TimeOffsetInMilliseconds(value: WinDef.UINT): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInjectedInputMouseInfo> {
    public override fun getValue() = ABI.makeIInjectedInputMouseInfo(pointer.getPointer(0))

    public fun setValue(value: IInjectedInputMouseInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInjectedInputMouseInfo {
    public val __1922848636_Ptr: Pointer?

    public val _1922848636_VtblPtr: Pointer?
      get() = __1922848636_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MouseOptions(): InjectedInputMouseOptions? {
      val fnPtr = _1922848636_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InjectedInputMouseOptions>()
      val hr = fn.invokeHR(arrayOf(__1922848636_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InjectedInputMouseOptions>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_MouseOptions(value: InjectedInputMouseOptions?): Unit {
      val fnPtr = _1922848636_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1922848636_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_MouseData(): WinDef.UINT {
      val fnPtr = _1922848636_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1922848636_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_MouseData(value: WinDef.UINT): Unit {
      val fnPtr = _1922848636_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1922848636_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_DeltaY(): Int {
      val fnPtr = _1922848636_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1922848636_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_DeltaY(value: Int): Unit {
      val fnPtr = _1922848636_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1922848636_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_DeltaX(): Int {
      val fnPtr = _1922848636_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1922848636_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_DeltaX(value: Int): Unit {
      val fnPtr = _1922848636_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1922848636_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_TimeOffsetInMilliseconds(): WinDef.UINT {
      val fnPtr = _1922848636_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1922848636_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_TimeOffsetInMilliseconds(value: WinDef.UINT): Unit {
      val fnPtr = _1922848636_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1922848636_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInjectedInputMouseInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1922848636_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInjectedInputMouseInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("96f56e6be47a5cf4418d8a5fb9670c7d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInjectedInputMouseInfo(ptr: Pointer?): WithDefault =
        IInjectedInputMouseInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInjectedInputMouseInfo {
      val address = segment.toRawLongValue()
      return makeIInjectedInputMouseInfo(Pointer(address))
    }

    public override fun toNative(obj: IInjectedInputMouseInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1922848636_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInjectedInputMouseInfo): Array<IInjectedInputMouseInfo?>
        = (elements as
        Array<IInjectedInputMouseInfo?>).castToImpl<IInjectedInputMouseInfo,IInjectedInputMouseInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInjectedInputMouseInfo?> =
        arrayOfNulls<IInjectedInputMouseInfo_Impl>(size) as Array<IInjectedInputMouseInfo?>
  }
}
