package Microsoft.UI.Xaml.Controls.Primitives

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

@ABIMarker(ISelectorItem.ABI::class)
@Signature("{5772c4de-60ea-5492-8c5e-b3323d5a3ca6}")
@Guid("5772c4de60ea54928c5eb3323d5a3ca6")
@WinRTInterface("5772c4de60ea54928c5eb3323d5a3ca6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISelectorItem.ByReference::class)
public interface ISelectorItem : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsSelected(): Boolean

  @InterfaceMethod(1)
  public fun put_IsSelected(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ISelectorItem>
      {
    public override fun getValue() = ABI.makeISelectorItem(pointer.getPointer(0))

    public fun setValue(value: ISelectorItem_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISelectorItem {
    public val __2108693091_Ptr: Pointer?

    public val _2108693091_VtblPtr: Pointer?
      get() = __2108693091_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsSelected(): Boolean {
      val fnPtr = _2108693091_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2108693091_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsSelected(value: Boolean): Unit {
      val fnPtr = _2108693091_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2108693091_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISelectorItem_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2108693091_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISelectorItem, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5772c4de60ea54928c5eb3323d5a3ca6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISelectorItem(ptr: Pointer?): WithDefault = ISelectorItem_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISelectorItem {
      val address = segment.toRawLongValue()
      return makeISelectorItem(Pointer(address))
    }

    public override fun toNative(obj: ISelectorItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2108693091_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISelectorItem): Array<ISelectorItem?> = (elements as
        Array<ISelectorItem?>).castToImpl<ISelectorItem,ISelectorItem_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISelectorItem?> =
        arrayOfNulls<ISelectorItem_Impl>(size) as Array<ISelectorItem?>
  }
}
