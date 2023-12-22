package Windows.Services.TargetedContent

import Windows.Foundation.Collections.IMap
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITargetedContentSubscriptionOptions.ABI::class)
@Signature("{61ee6ad0-2c83-421b-8467-413eaf1aeb97}")
@Guid("61ee6ad02c83421b8467413eaf1aeb97")
@WinRTInterface("61ee6ad02c83421b8467413eaf1aeb97")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITargetedContentSubscriptionOptions.ByReference::class)
public interface ITargetedContentSubscriptionOptions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SubscriptionId(): String?

  @InterfaceMethod(1)
  public fun get_AllowPartialContentAvailability(): Boolean

  @InterfaceMethod(2)
  public fun put_AllowPartialContentAvailability(value: Boolean): Unit

  @InterfaceMethod(3)
  public fun get_CloudQueryParameters(): IMap<String?, String?>?

  @InterfaceMethod(4)
  public fun get_LocalFilters(): IVector<String?>?

  @InterfaceMethod(5)
  public fun Update(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITargetedContentSubscriptionOptions> {
    public override fun getValue() =
        ABI.makeITargetedContentSubscriptionOptions(pointer.getPointer(0))

    public fun setValue(value: ITargetedContentSubscriptionOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITargetedContentSubscriptionOptions {
    public val __2034013379_Ptr: Pointer?

    public val _2034013379_VtblPtr: Pointer?
      get() = __2034013379_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SubscriptionId(): String? {
      val fnPtr = _2034013379_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2034013379_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_AllowPartialContentAvailability(): Boolean {
      val fnPtr = _2034013379_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2034013379_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_AllowPartialContentAvailability(value: Boolean): Unit {
      val fnPtr = _2034013379_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2034013379_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_CloudQueryParameters(): IMap<String?, String?>? {
      val fnPtr = _2034013379_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMap<String?, String?>>()
      val hr = fn.invokeHR(arrayOf(__2034013379_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMap<String?, String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_LocalFilters(): IVector<String?>? {
      val fnPtr = _2034013379_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__2034013379_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun Update(): Unit {
      val fnPtr = _2034013379_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2034013379_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ITargetedContentSubscriptionOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2034013379_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITargetedContentSubscriptionOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("61ee6ad02c83421b8467413eaf1aeb97")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITargetedContentSubscriptionOptions(ptr: Pointer?): WithDefault =
        ITargetedContentSubscriptionOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITargetedContentSubscriptionOptions {
      val address = segment.toRawLongValue()
      return makeITargetedContentSubscriptionOptions(Pointer(address))
    }

    public override fun toNative(obj: ITargetedContentSubscriptionOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2034013379_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITargetedContentSubscriptionOptions):
        Array<ITargetedContentSubscriptionOptions?> = (elements as
        Array<ITargetedContentSubscriptionOptions?>).castToImpl<ITargetedContentSubscriptionOptions,ITargetedContentSubscriptionOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITargetedContentSubscriptionOptions?> =
        arrayOfNulls<ITargetedContentSubscriptionOptions_Impl>(size) as
        Array<ITargetedContentSubscriptionOptions?>
  }
}
