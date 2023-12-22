package Microsoft.UI.Xaml.Input

import Microsoft.UI.Input.PointerDeviceType
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

@ABIMarker(IPointer.ABI::class)
@Signature("{1f9afbf5-11a3-5e68-aa1b-72febfa0ab23}")
@Guid("1f9afbf511a35e68aa1b72febfa0ab23")
@WinRTInterface("1f9afbf511a35e68aa1b72febfa0ab23")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPointer.ByReference::class)
public interface IPointer : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PointerId(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_PointerDeviceType(): PointerDeviceType?

  @InterfaceMethod(2)
  public fun get_IsInContact(): Boolean

  @InterfaceMethod(3)
  public fun get_IsInRange(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPointer> {
    public override fun getValue() = ABI.makeIPointer(pointer.getPointer(0))

    public fun setValue(value: IPointer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPointer {
    public val __203456210_Ptr: Pointer?

    public val _203456210_VtblPtr: Pointer?
      get() = __203456210_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PointerId(): WinDef.UINT {
      val fnPtr = _203456210_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__203456210_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_PointerDeviceType(): PointerDeviceType? {
      val fnPtr = _203456210_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PointerDeviceType>()
      val hr = fn.invokeHR(arrayOf(__203456210_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PointerDeviceType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_IsInContact(): Boolean {
      val fnPtr = _203456210_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__203456210_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_IsInRange(): Boolean {
      val fnPtr = _203456210_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__203456210_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IPointer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __203456210_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPointer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1f9afbf511a35e68aa1b72febfa0ab23")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPointer(ptr: Pointer?): WithDefault = IPointer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPointer {
      val address = segment.toRawLongValue()
      return makeIPointer(Pointer(address))
    }

    public override fun toNative(obj: IPointer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__203456210_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPointer): Array<IPointer?> = (elements as
        Array<IPointer?>).castToImpl<IPointer,IPointer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPointer?> = arrayOfNulls<IPointer_Impl>(size) as
        Array<IPointer?>
  }
}
