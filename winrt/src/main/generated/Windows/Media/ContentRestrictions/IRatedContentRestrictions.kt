package Windows.Media.ContentRestrictions

import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRatedContentRestrictions.ABI::class)
@Signature("{3f7f23cb-ba07-4401-a49d-8b9222205723}")
@Guid("3f7f23cbba074401a49d8b9222205723")
@WinRTInterface("3f7f23cbba074401a49d8b9222205723")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRatedContentRestrictions.ByReference::class)
public interface IRatedContentRestrictions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetBrowsePolicyAsync(): IAsyncOperation<ContentRestrictionsBrowsePolicy?>?

  @InterfaceMethod(1)
  public fun GetRestrictionLevelAsync(RatedContentDescription: RatedContentDescription?):
      IAsyncOperation<ContentAccessRestrictionLevel?>?

  @InterfaceMethod(2)
  public fun RequestContentAccessAsync(RatedContentDescription: RatedContentDescription?):
      IAsyncOperation<Boolean>?

  @InterfaceMethod(3)
  public fun add_RestrictionsChanged(handler: EventHandler<IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_RestrictionsChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRatedContentRestrictions> {
    public override fun getValue() = ABI.makeIRatedContentRestrictions(pointer.getPointer(0))

    public fun setValue(value: IRatedContentRestrictions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRatedContentRestrictions {
    public val __2013377862_Ptr: Pointer?

    public val _2013377862_VtblPtr: Pointer?
      get() = __2013377862_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetBrowsePolicyAsync(): IAsyncOperation<ContentRestrictionsBrowsePolicy?>? {
      val fnPtr = _2013377862_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ContentRestrictionsBrowsePolicy?>>()
      val hr = fn.invokeHR(arrayOf(__2013377862_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<ContentRestrictionsBrowsePolicy?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetRestrictionLevelAsync(RatedContentDescription: RatedContentDescription?):
        IAsyncOperation<ContentAccessRestrictionLevel?>? {
      val fnPtr = _2013377862_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ContentAccessRestrictionLevel?>>()
      val hr = fn.invokeHR(arrayOf(__2013377862_Ptr, marshalToNative(RatedContentDescription),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<ContentAccessRestrictionLevel?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override
        fun RequestContentAccessAsync(RatedContentDescription: RatedContentDescription?):
        IAsyncOperation<Boolean>? {
      val fnPtr = _2013377862_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__2013377862_Ptr, marshalToNative(RatedContentDescription),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun add_RestrictionsChanged(handler: EventHandler<IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _2013377862_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2013377862_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_RestrictionsChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _2013377862_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2013377862_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IRatedContentRestrictions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2013377862_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRatedContentRestrictions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3f7f23cbba074401a49d8b9222205723")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRatedContentRestrictions(ptr: Pointer?): WithDefault =
        IRatedContentRestrictions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRatedContentRestrictions {
      val address = segment.toRawLongValue()
      return makeIRatedContentRestrictions(Pointer(address))
    }

    public override fun toNative(obj: IRatedContentRestrictions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2013377862_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRatedContentRestrictions):
        Array<IRatedContentRestrictions?> = (elements as
        Array<IRatedContentRestrictions?>).castToImpl<IRatedContentRestrictions,IRatedContentRestrictions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRatedContentRestrictions?> =
        arrayOfNulls<IRatedContentRestrictions_Impl>(size) as Array<IRatedContentRestrictions?>
  }
}
