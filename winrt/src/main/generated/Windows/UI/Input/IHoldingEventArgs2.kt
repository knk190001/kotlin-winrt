package Windows.UI.Input

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

@ABIMarker(IHoldingEventArgs2.ABI::class)
@Signature("{141da9ea-4c79-5674-afea-493fdeb91f19}")
@Guid("141da9ea4c795674afea493fdeb91f19")
@WinRTInterface("141da9ea4c795674afea493fdeb91f19")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHoldingEventArgs2.ByReference::class)
public interface IHoldingEventArgs2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ContactCount(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_CurrentContactCount(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHoldingEventArgs2> {
    public override fun getValue() = ABI.makeIHoldingEventArgs2(pointer.getPointer(0))

    public fun setValue(value: IHoldingEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHoldingEventArgs2 {
    public val __1827545968_Ptr: Pointer?

    public val _1827545968_VtblPtr: Pointer?
      get() = __1827545968_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ContactCount(): WinDef.UINT {
      val fnPtr = _1827545968_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1827545968_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_CurrentContactCount(): WinDef.UINT {
      val fnPtr = _1827545968_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1827545968_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IHoldingEventArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1827545968_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHoldingEventArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("141da9ea4c795674afea493fdeb91f19")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHoldingEventArgs2(ptr: Pointer?): WithDefault = IHoldingEventArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHoldingEventArgs2 {
      val address = segment.toRawLongValue()
      return makeIHoldingEventArgs2(Pointer(address))
    }

    public override fun toNative(obj: IHoldingEventArgs2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1827545968_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHoldingEventArgs2): Array<IHoldingEventArgs2?> =
        (elements as
        Array<IHoldingEventArgs2?>).castToImpl<IHoldingEventArgs2,IHoldingEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHoldingEventArgs2?> =
        arrayOfNulls<IHoldingEventArgs2_Impl>(size) as Array<IHoldingEventArgs2?>
  }
}
