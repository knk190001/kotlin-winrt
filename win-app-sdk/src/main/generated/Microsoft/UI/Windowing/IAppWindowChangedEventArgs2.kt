package Microsoft.UI.Windowing

import Microsoft.UI.WindowId
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

@ABIMarker(IAppWindowChangedEventArgs2.ABI::class)
@Signature("{a773ab4c-a5ec-50e8-98ac-247fe6cd4227}")
@Guid("a773ab4ca5ec50e898ac247fe6cd4227")
@WinRTInterface("a773ab4ca5ec50e898ac247fe6cd4227")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppWindowChangedEventArgs2.ByReference::class)
public interface IAppWindowChangedEventArgs2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DidZOrderChange(): Boolean

  @InterfaceMethod(1)
  public fun get_IsZOrderAtBottom(): Boolean

  @InterfaceMethod(2)
  public fun get_IsZOrderAtTop(): Boolean

  @InterfaceMethod(3)
  public fun get_ZOrderBelowWindowId(): WindowId?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppWindowChangedEventArgs2> {
    public override fun getValue() = ABI.makeIAppWindowChangedEventArgs2(pointer.getPointer(0))

    public fun setValue(value: IAppWindowChangedEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppWindowChangedEventArgs2 {
    public val __735338735_Ptr: Pointer?

    public val _735338735_VtblPtr: Pointer?
      get() = __735338735_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DidZOrderChange(): Boolean {
      val fnPtr = _735338735_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__735338735_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_IsZOrderAtBottom(): Boolean {
      val fnPtr = _735338735_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__735338735_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_IsZOrderAtTop(): Boolean {
      val fnPtr = _735338735_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__735338735_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_ZOrderBelowWindowId(): WindowId? {
      val fnPtr = _735338735_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WindowId>()
      val hr = fn.invokeHR(arrayOf(__735338735_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WindowId>(result.getValue())
      return resultValue
    }
  }

  public class IAppWindowChangedEventArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __735338735_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppWindowChangedEventArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a773ab4ca5ec50e898ac247fe6cd4227")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppWindowChangedEventArgs2(ptr: Pointer?): WithDefault =
        IAppWindowChangedEventArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppWindowChangedEventArgs2 {
      val address = segment.toRawLongValue()
      return makeIAppWindowChangedEventArgs2(Pointer(address))
    }

    public override fun toNative(obj: IAppWindowChangedEventArgs2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__735338735_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppWindowChangedEventArgs2):
        Array<IAppWindowChangedEventArgs2?> = (elements as
        Array<IAppWindowChangedEventArgs2?>).castToImpl<IAppWindowChangedEventArgs2,IAppWindowChangedEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppWindowChangedEventArgs2?> =
        arrayOfNulls<IAppWindowChangedEventArgs2_Impl>(size) as Array<IAppWindowChangedEventArgs2?>
  }
}
