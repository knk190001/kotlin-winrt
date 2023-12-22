package Windows.Media.ContentRestrictions

import Windows.Foundation.IReference
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IContentRestrictionsBrowsePolicy.ABI::class)
@Signature("{8c0133a4-442e-461a-8757-fad2f5bd37e4}")
@Guid("8c0133a4442e461a8757fad2f5bd37e4")
@WinRTInterface("8c0133a4442e461a8757fad2f5bd37e4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentRestrictionsBrowsePolicy.ByReference::class)
public interface IContentRestrictionsBrowsePolicy : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_GeographicRegion(): String?

  @InterfaceMethod(1)
  public fun get_MaxBrowsableAgeRating(): IReference<WinDef.UINT>?

  @InterfaceMethod(2)
  public fun get_PreferredAgeRating(): IReference<WinDef.UINT>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentRestrictionsBrowsePolicy> {
    public override fun getValue() = ABI.makeIContentRestrictionsBrowsePolicy(pointer.getPointer(0))

    public fun setValue(value: IContentRestrictionsBrowsePolicy_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentRestrictionsBrowsePolicy {
    public val __482326434_Ptr: Pointer?

    public val _482326434_VtblPtr: Pointer?
      get() = __482326434_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_GeographicRegion(): String? {
      val fnPtr = _482326434_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__482326434_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_MaxBrowsableAgeRating(): IReference<WinDef.UINT>? {
      val fnPtr = _482326434_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__482326434_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_PreferredAgeRating(): IReference<WinDef.UINT>? {
      val fnPtr = _482326434_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__482326434_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<WinDef.UINT>>(result.getValue())
      return resultValue
    }
  }

  public class IContentRestrictionsBrowsePolicy_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __482326434_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentRestrictionsBrowsePolicy, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8c0133a4442e461a8757fad2f5bd37e4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentRestrictionsBrowsePolicy(ptr: Pointer?): WithDefault =
        IContentRestrictionsBrowsePolicy_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentRestrictionsBrowsePolicy {
      val address = segment.toRawLongValue()
      return makeIContentRestrictionsBrowsePolicy(Pointer(address))
    }

    public override fun toNative(obj: IContentRestrictionsBrowsePolicy): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__482326434_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentRestrictionsBrowsePolicy):
        Array<IContentRestrictionsBrowsePolicy?> = (elements as
        Array<IContentRestrictionsBrowsePolicy?>).castToImpl<IContentRestrictionsBrowsePolicy,IContentRestrictionsBrowsePolicy_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentRestrictionsBrowsePolicy?> =
        arrayOfNulls<IContentRestrictionsBrowsePolicy_Impl>(size) as
        Array<IContentRestrictionsBrowsePolicy?>
  }
}
