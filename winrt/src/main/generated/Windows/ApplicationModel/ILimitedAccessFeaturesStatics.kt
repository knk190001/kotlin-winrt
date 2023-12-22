package Windows.ApplicationModel

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

@ABIMarker(ILimitedAccessFeaturesStatics.ABI::class)
@Signature("{8be612d4-302b-5fbf-a632-1a99e43e8925}")
@Guid("8be612d4302b5fbfa6321a99e43e8925")
@WinRTInterface("8be612d4302b5fbfa6321a99e43e8925")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILimitedAccessFeaturesStatics.ByReference::class)
public interface ILimitedAccessFeaturesStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun TryUnlockFeature(
    featureId: String?,
    token: String?,
    attestation: String?
  ): LimitedAccessFeatureRequestResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILimitedAccessFeaturesStatics> {
    public override fun getValue() = ABI.makeILimitedAccessFeaturesStatics(pointer.getPointer(0))

    public fun setValue(value: ILimitedAccessFeaturesStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILimitedAccessFeaturesStatics {
    public val __1635728209_Ptr: Pointer?

    public val _1635728209_VtblPtr: Pointer?
      get() = __1635728209_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TryUnlockFeature(
      featureId: String?,
      token: String?,
      attestation: String?
    ): LimitedAccessFeatureRequestResult? {
      val fnPtr = _1635728209_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LimitedAccessFeatureRequestResult>()
      val hr = fn.invokeHR(arrayOf(__1635728209_Ptr, marshalToNative(featureId),
          marshalToNative(token), marshalToNative(attestation), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LimitedAccessFeatureRequestResult>(result.getValue())
      return resultValue
    }
  }

  public class ILimitedAccessFeaturesStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1635728209_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILimitedAccessFeaturesStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8be612d4302b5fbfa6321a99e43e8925")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILimitedAccessFeaturesStatics(ptr: Pointer?): WithDefault =
        ILimitedAccessFeaturesStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILimitedAccessFeaturesStatics {
      val address = segment.toRawLongValue()
      return makeILimitedAccessFeaturesStatics(Pointer(address))
    }

    public override fun toNative(obj: ILimitedAccessFeaturesStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1635728209_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILimitedAccessFeaturesStatics):
        Array<ILimitedAccessFeaturesStatics?> = (elements as
        Array<ILimitedAccessFeaturesStatics?>).castToImpl<ILimitedAccessFeaturesStatics,ILimitedAccessFeaturesStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILimitedAccessFeaturesStatics?> =
        arrayOfNulls<ILimitedAccessFeaturesStatics_Impl>(size) as
        Array<ILimitedAccessFeaturesStatics?>
  }
}
