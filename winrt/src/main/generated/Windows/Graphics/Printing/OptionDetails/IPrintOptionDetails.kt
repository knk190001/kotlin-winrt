package Windows.Graphics.Printing.OptionDetails

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPrintOptionDetails.ABI::class)
@Signature("{390686cf-d682-495f-adfe-d7333f5c1808}")
@Guid("390686cfd682495fadfed7333f5c1808")
@WinRTInterface("390686cfd682495fadfed7333f5c1808")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintOptionDetails.ByReference::class)
public interface IPrintOptionDetails : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_OptionId(): String?

  @InterfaceMethod(1)
  public fun get_OptionType(): PrintOptionType?

  @InterfaceMethod(2)
  public fun put_ErrorText(value: String?): Unit

  @InterfaceMethod(3)
  public fun get_ErrorText(): String?

  @InterfaceMethod(4)
  public fun put_State(value: PrintOptionStates?): Unit

  @InterfaceMethod(5)
  public fun get_State(): PrintOptionStates?

  @InterfaceMethod(6)
  public fun get_Value(): IUnknown?

  @InterfaceMethod(7)
  public fun TrySetValue(value: IUnknown?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintOptionDetails> {
    public override fun getValue() = ABI.makeIPrintOptionDetails(pointer.getPointer(0))

    public fun setValue(value: IPrintOptionDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintOptionDetails {
    public val __143188995_Ptr: Pointer?

    public val _143188995_VtblPtr: Pointer?
      get() = __143188995_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OptionId(): String? {
      val fnPtr = _143188995_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__143188995_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_OptionType(): PrintOptionType? {
      val fnPtr = _143188995_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintOptionType>()
      val hr = fn.invokeHR(arrayOf(__143188995_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintOptionType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_ErrorText(value: String?): Unit {
      val fnPtr = _143188995_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__143188995_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_ErrorText(): String? {
      val fnPtr = _143188995_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__143188995_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_State(value: PrintOptionStates?): Unit {
      val fnPtr = _143188995_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__143188995_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_State(): PrintOptionStates? {
      val fnPtr = _143188995_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintOptionStates>()
      val hr = fn.invokeHR(arrayOf(__143188995_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintOptionStates>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_Value(): IUnknown? {
      val fnPtr = _143188995_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__143188995_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun TrySetValue(value: IUnknown?): Boolean {
      val fnPtr = _143188995_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__143188995_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IPrintOptionDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __143188995_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintOptionDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("390686cfd682495fadfed7333f5c1808")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintOptionDetails(ptr: Pointer?): WithDefault = IPrintOptionDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintOptionDetails {
      val address = segment.toRawLongValue()
      return makeIPrintOptionDetails(Pointer(address))
    }

    public override fun toNative(obj: IPrintOptionDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__143188995_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintOptionDetails): Array<IPrintOptionDetails?> =
        (elements as
        Array<IPrintOptionDetails?>).castToImpl<IPrintOptionDetails,IPrintOptionDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintOptionDetails?> =
        arrayOfNulls<IPrintOptionDetails_Impl>(size) as Array<IPrintOptionDetails?>
  }
}
