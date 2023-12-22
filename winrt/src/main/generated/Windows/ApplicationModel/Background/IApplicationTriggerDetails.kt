package Windows.ApplicationModel.Background

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

@ABIMarker(IApplicationTriggerDetails.ABI::class)
@Signature("{97dc6ab2-2219-4a9e-9c5e-41d047f76e82}")
@Guid("97dc6ab222194a9e9c5e41d047f76e82")
@WinRTInterface("97dc6ab222194a9e9c5e41d047f76e82")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IApplicationTriggerDetails.ByReference::class)
public interface IApplicationTriggerDetails : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Arguments(): ValueSet?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IApplicationTriggerDetails> {
    public override fun getValue() = ABI.makeIApplicationTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: IApplicationTriggerDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IApplicationTriggerDetails {
    public val __743912969_Ptr: Pointer?

    public val _743912969_VtblPtr: Pointer?
      get() = __743912969_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Arguments(): ValueSet? {
      val fnPtr = _743912969_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ValueSet>()
      val hr = fn.invokeHR(arrayOf(__743912969_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ValueSet>(result.getValue())
      return resultValue
    }
  }

  public class IApplicationTriggerDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __743912969_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IApplicationTriggerDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("97dc6ab222194a9e9c5e41d047f76e82")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIApplicationTriggerDetails(ptr: Pointer?): WithDefault =
        IApplicationTriggerDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IApplicationTriggerDetails {
      val address = segment.toRawLongValue()
      return makeIApplicationTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: IApplicationTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__743912969_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IApplicationTriggerDetails):
        Array<IApplicationTriggerDetails?> = (elements as
        Array<IApplicationTriggerDetails?>).castToImpl<IApplicationTriggerDetails,IApplicationTriggerDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IApplicationTriggerDetails?> =
        arrayOfNulls<IApplicationTriggerDetails_Impl>(size) as Array<IApplicationTriggerDetails?>
  }
}
