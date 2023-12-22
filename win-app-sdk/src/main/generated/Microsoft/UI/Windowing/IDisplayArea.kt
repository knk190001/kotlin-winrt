package Microsoft.UI.Windowing

import Microsoft.UI.DisplayId
import Windows.Graphics.RectInt32
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

@ABIMarker(IDisplayArea.ABI::class)
@Signature("{5c7e0537-b621-5579-bcae-a84aa8746167}")
@Guid("5c7e0537b6215579bcaea84aa8746167")
@WinRTInterface("5c7e0537b6215579bcaea84aa8746167")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDisplayArea.ByReference::class)
public interface IDisplayArea : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DisplayId(): DisplayId?

  @InterfaceMethod(1)
  public fun get_IsPrimary(): Boolean

  @InterfaceMethod(2)
  public fun get_OuterBounds(): RectInt32?

  @InterfaceMethod(3)
  public fun get_WorkArea(): RectInt32?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IDisplayArea> {
    public override fun getValue() = ABI.makeIDisplayArea(pointer.getPointer(0))

    public fun setValue(value: IDisplayArea_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDisplayArea {
    public val __853279618_Ptr: Pointer?

    public val _853279618_VtblPtr: Pointer?
      get() = __853279618_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DisplayId(): DisplayId? {
      val fnPtr = _853279618_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayId>()
      val hr = fn.invokeHR(arrayOf(__853279618_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayId>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsPrimary(): Boolean {
      val fnPtr = _853279618_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__853279618_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_OuterBounds(): RectInt32? {
      val fnPtr = _853279618_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RectInt32>()
      val hr = fn.invokeHR(arrayOf(__853279618_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RectInt32>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_WorkArea(): RectInt32? {
      val fnPtr = _853279618_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RectInt32>()
      val hr = fn.invokeHR(arrayOf(__853279618_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RectInt32>(result.getValue())
      return resultValue
    }
  }

  public class IDisplayArea_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __853279618_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDisplayArea, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5c7e0537b6215579bcaea84aa8746167")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDisplayArea(ptr: Pointer?): WithDefault = IDisplayArea_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDisplayArea {
      val address = segment.toRawLongValue()
      return makeIDisplayArea(Pointer(address))
    }

    public override fun toNative(obj: IDisplayArea): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__853279618_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDisplayArea): Array<IDisplayArea?> = (elements as
        Array<IDisplayArea?>).castToImpl<IDisplayArea,IDisplayArea_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDisplayArea?> =
        arrayOfNulls<IDisplayArea_Impl>(size) as Array<IDisplayArea?>
  }
}
