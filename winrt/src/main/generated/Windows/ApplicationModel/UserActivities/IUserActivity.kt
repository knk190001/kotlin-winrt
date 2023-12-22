package Windows.ApplicationModel.UserActivities

import Windows.Foundation.IAsyncAction
import Windows.Foundation.Uri
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

@ABIMarker(IUserActivity.ABI::class)
@Signature("{fc103e9e-2cab-4d36-aea2-b4bb556cef0f}")
@Guid("fc103e9e2cab4d36aea2b4bb556cef0f")
@WinRTInterface("fc103e9e2cab4d36aea2b4bb556cef0f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserActivity.ByReference::class)
public interface IUserActivity : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_State(): UserActivityState?

  @InterfaceMethod(1)
  public fun get_ActivityId(): String?

  @InterfaceMethod(2)
  public fun get_VisualElements(): UserActivityVisualElements?

  @InterfaceMethod(3)
  public fun get_ContentUri(): Uri?

  @InterfaceMethod(4)
  public fun put_ContentUri(value: Uri?): Unit

  @InterfaceMethod(5)
  public fun get_ContentType(): String?

  @InterfaceMethod(6)
  public fun put_ContentType(value: String?): Unit

  @InterfaceMethod(7)
  public fun get_FallbackUri(): Uri?

  @InterfaceMethod(8)
  public fun put_FallbackUri(value: Uri?): Unit

  @InterfaceMethod(9)
  public fun get_ActivationUri(): Uri?

  @InterfaceMethod(10)
  public fun put_ActivationUri(value: Uri?): Unit

  @InterfaceMethod(11)
  public fun get_ContentInfo(): IUserActivityContentInfo?

  @InterfaceMethod(12)
  public fun put_ContentInfo(value: IUserActivityContentInfo?): Unit

  @InterfaceMethod(13)
  public fun SaveAsync(): IAsyncAction?

  @InterfaceMethod(14)
  public fun CreateSession(): UserActivitySession?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IUserActivity>
      {
    public override fun getValue() = ABI.makeIUserActivity(pointer.getPointer(0))

    public fun setValue(value: IUserActivity_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserActivity {
    public val __1777016639_Ptr: Pointer?

    public val _1777016639_VtblPtr: Pointer?
      get() = __1777016639_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_State(): UserActivityState? {
      val fnPtr = _1777016639_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserActivityState>()
      val hr = fn.invokeHR(arrayOf(__1777016639_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserActivityState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ActivityId(): String? {
      val fnPtr = _1777016639_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1777016639_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_VisualElements(): UserActivityVisualElements? {
      val fnPtr = _1777016639_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserActivityVisualElements>()
      val hr = fn.invokeHR(arrayOf(__1777016639_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserActivityVisualElements>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ContentUri(): Uri? {
      val fnPtr = _1777016639_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1777016639_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_ContentUri(value: Uri?): Unit {
      val fnPtr = _1777016639_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1777016639_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_ContentType(): String? {
      val fnPtr = _1777016639_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1777016639_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_ContentType(value: String?): Unit {
      val fnPtr = _1777016639_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1777016639_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_FallbackUri(): Uri? {
      val fnPtr = _1777016639_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1777016639_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun put_FallbackUri(value: Uri?): Unit {
      val fnPtr = _1777016639_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1777016639_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_ActivationUri(): Uri? {
      val fnPtr = _1777016639_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1777016639_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun put_ActivationUri(value: Uri?): Unit {
      val fnPtr = _1777016639_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1777016639_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun get_ContentInfo(): IUserActivityContentInfo? {
      val fnPtr = _1777016639_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUserActivityContentInfo>()
      val hr = fn.invokeHR(arrayOf(__1777016639_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUserActivityContentInfo>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun put_ContentInfo(value: IUserActivityContentInfo?): Unit {
      val fnPtr = _1777016639_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1777016639_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun SaveAsync(): IAsyncAction? {
      val fnPtr = _1777016639_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1777016639_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun CreateSession(): UserActivitySession? {
      val fnPtr = _1777016639_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserActivitySession>()
      val hr = fn.invokeHR(arrayOf(__1777016639_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserActivitySession>(result.getValue())
      return resultValue
    }
  }

  public class IUserActivity_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1777016639_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserActivity, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fc103e9e2cab4d36aea2b4bb556cef0f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserActivity(ptr: Pointer?): WithDefault = IUserActivity_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserActivity {
      val address = segment.toRawLongValue()
      return makeIUserActivity(Pointer(address))
    }

    public override fun toNative(obj: IUserActivity): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1777016639_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserActivity): Array<IUserActivity?> = (elements as
        Array<IUserActivity?>).castToImpl<IUserActivity,IUserActivity_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserActivity?> =
        arrayOfNulls<IUserActivity_Impl>(size) as Array<IUserActivity?>
  }
}
