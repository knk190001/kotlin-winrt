package Windows.Media

import Windows.Foundation.Collections.ValueSet
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMediaProcessingTriggerDetails.ABI::class)
@Signature("{eb8564ac-a351-4f4e-b4f0-9bf2408993db}")
@Guid("eb8564aca3514f4eb4f09bf2408993db")
@WinRTInterface("eb8564aca3514f4eb4f09bf2408993db")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaProcessingTriggerDetails.ByReference::class)
public interface IMediaProcessingTriggerDetails : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Arguments(): ValueSet?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaProcessingTriggerDetails> {
    public override fun getValue() = ABI.makeIMediaProcessingTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: IMediaProcessingTriggerDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaProcessingTriggerDetails {
    public val __976113071_Ptr: Pointer?

    public val _976113071_VtblPtr: Pointer?
      get() = __976113071_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Arguments(): ValueSet? {
      val fnPtr = _976113071_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ValueSet>()
      val hr = fn.invokeHR(arrayOf(__976113071_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ValueSet>(result.getValue())
      return resultValue
    }
  }

  public class IMediaProcessingTriggerDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __976113071_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaProcessingTriggerDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("eb8564aca3514f4eb4f09bf2408993db")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaProcessingTriggerDetails(ptr: Pointer?): WithDefault =
        IMediaProcessingTriggerDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaProcessingTriggerDetails {
      val address = segment.toRawLongValue()
      return makeIMediaProcessingTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: IMediaProcessingTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__976113071_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaProcessingTriggerDetails):
        Array<IMediaProcessingTriggerDetails?> = (elements as
        Array<IMediaProcessingTriggerDetails?>).castToImpl<IMediaProcessingTriggerDetails,IMediaProcessingTriggerDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaProcessingTriggerDetails?> =
        arrayOfNulls<IMediaProcessingTriggerDetails_Impl>(size) as
        Array<IMediaProcessingTriggerDetails?>
  }
}
