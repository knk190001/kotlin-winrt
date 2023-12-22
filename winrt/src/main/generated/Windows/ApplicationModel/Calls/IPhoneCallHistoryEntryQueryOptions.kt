package Windows.ApplicationModel.Calls

import Windows.Foundation.Collections.IVector
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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPhoneCallHistoryEntryQueryOptions.ABI::class)
@Signature("{9c5fe15c-8bed-40ca-b06e-c4ca8eae5c87}")
@Guid("9c5fe15c8bed40cab06ec4ca8eae5c87")
@WinRTInterface("9c5fe15c8bed40cab06ec4ca8eae5c87")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhoneCallHistoryEntryQueryOptions.ByReference::class)
public interface IPhoneCallHistoryEntryQueryOptions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DesiredMedia(): PhoneCallHistoryEntryQueryDesiredMedia?

  @InterfaceMethod(1)
  public fun put_DesiredMedia(value: PhoneCallHistoryEntryQueryDesiredMedia?): Unit

  @InterfaceMethod(2)
  public fun get_SourceIds(): IVector<String?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPhoneCallHistoryEntryQueryOptions> {
    public override fun getValue() =
        ABI.makeIPhoneCallHistoryEntryQueryOptions(pointer.getPointer(0))

    public fun setValue(value: IPhoneCallHistoryEntryQueryOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhoneCallHistoryEntryQueryOptions {
    public val __2129600926_Ptr: Pointer?

    public val _2129600926_VtblPtr: Pointer?
      get() = __2129600926_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DesiredMedia(): PhoneCallHistoryEntryQueryDesiredMedia? {
      val fnPtr = _2129600926_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhoneCallHistoryEntryQueryDesiredMedia>()
      val hr = fn.invokeHR(arrayOf(__2129600926_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhoneCallHistoryEntryQueryDesiredMedia>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_DesiredMedia(value: PhoneCallHistoryEntryQueryDesiredMedia?): Unit {
      val fnPtr = _2129600926_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2129600926_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_SourceIds(): IVector<String?>? {
      val fnPtr = _2129600926_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__2129600926_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }
  }

  public class IPhoneCallHistoryEntryQueryOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2129600926_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhoneCallHistoryEntryQueryOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9c5fe15c8bed40cab06ec4ca8eae5c87")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhoneCallHistoryEntryQueryOptions(ptr: Pointer?): WithDefault =
        IPhoneCallHistoryEntryQueryOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhoneCallHistoryEntryQueryOptions {
      val address = segment.toRawLongValue()
      return makeIPhoneCallHistoryEntryQueryOptions(Pointer(address))
    }

    public override fun toNative(obj: IPhoneCallHistoryEntryQueryOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2129600926_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhoneCallHistoryEntryQueryOptions):
        Array<IPhoneCallHistoryEntryQueryOptions?> = (elements as
        Array<IPhoneCallHistoryEntryQueryOptions?>).castToImpl<IPhoneCallHistoryEntryQueryOptions,IPhoneCallHistoryEntryQueryOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhoneCallHistoryEntryQueryOptions?> =
        arrayOfNulls<IPhoneCallHistoryEntryQueryOptions_Impl>(size) as
        Array<IPhoneCallHistoryEntryQueryOptions?>
  }
}
