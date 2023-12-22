package Windows.UI.Input.Inking

import Windows.Foundation.DateTime
import Windows.Foundation.IReference
import Windows.Foundation.TimeSpan
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

@ABIMarker(IInkStroke3.ABI::class)
@Signature("{4a807374-9499-411d-a1c4-68855d03d65f}")
@Guid("4a8073749499411da1c468855d03d65f")
@WinRTInterface("4a8073749499411da1c468855d03d65f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkStroke3.ByReference::class)
public interface IInkStroke3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_StrokeStartedTime(): IReference<DateTime?>?

  @InterfaceMethod(2)
  public fun put_StrokeStartedTime(value: IReference<DateTime?>?): Unit

  @InterfaceMethod(3)
  public fun get_StrokeDuration(): IReference<TimeSpan?>?

  @InterfaceMethod(4)
  public fun put_StrokeDuration(value: IReference<TimeSpan?>?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IInkStroke3> {
    public override fun getValue() = ABI.makeIInkStroke3(pointer.getPointer(0))

    public fun setValue(value: IInkStroke3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkStroke3 {
    public val __1658420047_Ptr: Pointer?

    public val _1658420047_VtblPtr: Pointer?
      get() = __1658420047_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): WinDef.UINT {
      val fnPtr = _1658420047_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1658420047_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_StrokeStartedTime(): IReference<DateTime?>? {
      val fnPtr = _1658420047_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__1658420047_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_StrokeStartedTime(value: IReference<DateTime?>?): Unit {
      val fnPtr = _1658420047_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1658420047_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_StrokeDuration(): IReference<TimeSpan?>? {
      val fnPtr = _1658420047_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<TimeSpan?>>()
      val hr = fn.invokeHR(arrayOf(__1658420047_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<TimeSpan?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_StrokeDuration(value: IReference<TimeSpan?>?): Unit {
      val fnPtr = _1658420047_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1658420047_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInkStroke3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1658420047_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkStroke3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4a8073749499411da1c468855d03d65f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkStroke3(ptr: Pointer?): WithDefault = IInkStroke3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkStroke3 {
      val address = segment.toRawLongValue()
      return makeIInkStroke3(Pointer(address))
    }

    public override fun toNative(obj: IInkStroke3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1658420047_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkStroke3): Array<IInkStroke3?> = (elements as
        Array<IInkStroke3?>).castToImpl<IInkStroke3,IInkStroke3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkStroke3?> =
        arrayOfNulls<IInkStroke3_Impl>(size) as Array<IInkStroke3?>
  }
}
