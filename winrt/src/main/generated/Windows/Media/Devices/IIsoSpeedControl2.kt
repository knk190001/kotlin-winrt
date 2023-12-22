package Windows.Media.Devices

import Windows.Foundation.IAsyncAction
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IIsoSpeedControl2.ABI::class)
@Signature("{6f1578f2-6d77-4f8a-8c2f-6130b6395053}")
@Guid("6f1578f26d774f8a8c2f6130b6395053")
@WinRTInterface("6f1578f26d774f8a8c2f6130b6395053")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IIsoSpeedControl2.ByReference::class)
public interface IIsoSpeedControl2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Min(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_Max(): WinDef.UINT

  @InterfaceMethod(2)
  public fun get_Step(): WinDef.UINT

  @InterfaceMethod(3)
  public fun get_Value(): WinDef.UINT

  @InterfaceMethod(4)
  public fun SetValueAsync(isoSpeed: WinDef.UINT): IAsyncAction?

  @InterfaceMethod(5)
  public fun get_Auto(): Boolean

  @InterfaceMethod(6)
  public fun SetAutoAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IIsoSpeedControl2> {
    public override fun getValue() = ABI.makeIIsoSpeedControl2(pointer.getPointer(0))

    public fun setValue(value: IIsoSpeedControl2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IIsoSpeedControl2 {
    public val __1616419448_Ptr: Pointer?

    public val _1616419448_VtblPtr: Pointer?
      get() = __1616419448_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Min(): WinDef.UINT {
      val fnPtr = _1616419448_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1616419448_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Max(): WinDef.UINT {
      val fnPtr = _1616419448_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1616419448_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_Step(): WinDef.UINT {
      val fnPtr = _1616419448_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1616419448_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_Value(): WinDef.UINT {
      val fnPtr = _1616419448_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1616419448_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun SetValueAsync(isoSpeed: WinDef.UINT): IAsyncAction? {
      val fnPtr = _1616419448_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1616419448_Ptr, isoSpeed, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Auto(): Boolean {
      val fnPtr = _1616419448_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1616419448_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun SetAutoAsync(): IAsyncAction? {
      val fnPtr = _1616419448_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1616419448_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IIsoSpeedControl2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1616419448_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IIsoSpeedControl2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6f1578f26d774f8a8c2f6130b6395053")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIIsoSpeedControl2(ptr: Pointer?): WithDefault = IIsoSpeedControl2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IIsoSpeedControl2 {
      val address = segment.toRawLongValue()
      return makeIIsoSpeedControl2(Pointer(address))
    }

    public override fun toNative(obj: IIsoSpeedControl2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1616419448_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IIsoSpeedControl2): Array<IIsoSpeedControl2?> = (elements
        as Array<IIsoSpeedControl2?>).castToImpl<IIsoSpeedControl2,IIsoSpeedControl2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IIsoSpeedControl2?> =
        arrayOfNulls<IIsoSpeedControl2_Impl>(size) as Array<IIsoSpeedControl2?>
  }
}
