package Windows.UI.Xaml.Controls

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

@ABIMarker(IListViewBase5.ABI::class)
@Signature("{1a9c6e99-1719-4b80-b335-628331a07019}")
@Guid("1a9c6e9917194b80b335628331a07019")
@WinRTInterface("1a9c6e9917194b80b335628331a07019")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IListViewBase5.ByReference::class)
public interface IListViewBase5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SingleSelectionFollowsFocus(): Boolean

  @InterfaceMethod(1)
  public fun put_SingleSelectionFollowsFocus(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun IsDragSource(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IListViewBase5>
      {
    public override fun getValue() = ABI.makeIListViewBase5(pointer.getPointer(0))

    public fun setValue(value: IListViewBase5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IListViewBase5 {
    public val __1194261061_Ptr: Pointer?

    public val _1194261061_VtblPtr: Pointer?
      get() = __1194261061_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SingleSelectionFollowsFocus(): Boolean {
      val fnPtr = _1194261061_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1194261061_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_SingleSelectionFollowsFocus(value: Boolean): Unit {
      val fnPtr = _1194261061_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1194261061_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun IsDragSource(): Boolean {
      val fnPtr = _1194261061_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1194261061_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IListViewBase5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1194261061_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IListViewBase5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1a9c6e9917194b80b335628331a07019")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIListViewBase5(ptr: Pointer?): WithDefault = IListViewBase5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IListViewBase5 {
      val address = segment.toRawLongValue()
      return makeIListViewBase5(Pointer(address))
    }

    public override fun toNative(obj: IListViewBase5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1194261061_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IListViewBase5): Array<IListViewBase5?> = (elements as
        Array<IListViewBase5?>).castToImpl<IListViewBase5,IListViewBase5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IListViewBase5?> =
        arrayOfNulls<IListViewBase5_Impl>(size) as Array<IListViewBase5?>
  }
}
