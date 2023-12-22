package Windows.ApplicationModel.SocialInfo.Provider

import Windows.ApplicationModel.SocialInfo.SocialFeedItem
import Windows.ApplicationModel.SocialInfo.SocialFeedKind
import Windows.Foundation.Collections.IVector
import Windows.Foundation.IAsyncAction
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

@ABIMarker(ISocialFeedUpdater.ABI::class)
@Signature("{7a0c0aa7-ed89-4bd5-a8d9-15f4d9861c10}")
@Guid("7a0c0aa7ed894bd5a8d915f4d9861c10")
@WinRTInterface("7a0c0aa7ed894bd5a8d915f4d9861c10")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISocialFeedUpdater.ByReference::class)
public interface ISocialFeedUpdater : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_OwnerRemoteId(): String?

  @InterfaceMethod(1)
  public fun get_Kind(): SocialFeedKind?

  @InterfaceMethod(2)
  public fun get_Items(): IVector<SocialFeedItem?>?

  @InterfaceMethod(3)
  public fun CommitAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISocialFeedUpdater> {
    public override fun getValue() = ABI.makeISocialFeedUpdater(pointer.getPointer(0))

    public fun setValue(value: ISocialFeedUpdater_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISocialFeedUpdater {
    public val __611663953_Ptr: Pointer?

    public val _611663953_VtblPtr: Pointer?
      get() = __611663953_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OwnerRemoteId(): String? {
      val fnPtr = _611663953_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__611663953_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Kind(): SocialFeedKind? {
      val fnPtr = _611663953_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SocialFeedKind>()
      val hr = fn.invokeHR(arrayOf(__611663953_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SocialFeedKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Items(): IVector<SocialFeedItem?>? {
      val fnPtr = _611663953_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<SocialFeedItem?>>()
      val hr = fn.invokeHR(arrayOf(__611663953_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<SocialFeedItem?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun CommitAsync(): IAsyncAction? {
      val fnPtr = _611663953_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__611663953_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class ISocialFeedUpdater_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __611663953_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISocialFeedUpdater, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7a0c0aa7ed894bd5a8d915f4d9861c10")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISocialFeedUpdater(ptr: Pointer?): WithDefault = ISocialFeedUpdater_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISocialFeedUpdater {
      val address = segment.toRawLongValue()
      return makeISocialFeedUpdater(Pointer(address))
    }

    public override fun toNative(obj: ISocialFeedUpdater): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__611663953_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISocialFeedUpdater): Array<ISocialFeedUpdater?> =
        (elements as
        Array<ISocialFeedUpdater?>).castToImpl<ISocialFeedUpdater,ISocialFeedUpdater_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISocialFeedUpdater?> =
        arrayOfNulls<ISocialFeedUpdater_Impl>(size) as Array<ISocialFeedUpdater?>
  }
}
