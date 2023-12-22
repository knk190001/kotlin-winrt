package Windows.System.UserProfile

import Windows.Foundation.IAsyncOperation
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ILockScreenImageFeedStatics.ABI::class)
@Signature("{2c0d73f6-03a9-41a6-9b01-495251ff51d5}")
@Guid("2c0d73f603a941a69b01495251ff51d5")
@WinRTInterface("2c0d73f603a941a69b01495251ff51d5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILockScreenImageFeedStatics.ByReference::class)
public interface ILockScreenImageFeedStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RequestSetImageFeedAsync(syndicationFeedUri: Uri?):
      IAsyncOperation<SetImageFeedResult?>?

  @InterfaceMethod(1)
  public fun TryRemoveImageFeed(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILockScreenImageFeedStatics> {
    public override fun getValue() = ABI.makeILockScreenImageFeedStatics(pointer.getPointer(0))

    public fun setValue(value: ILockScreenImageFeedStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILockScreenImageFeedStatics {
    public val __1123081442_Ptr: Pointer?

    public val _1123081442_VtblPtr: Pointer?
      get() = __1123081442_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RequestSetImageFeedAsync(syndicationFeedUri: Uri?):
        IAsyncOperation<SetImageFeedResult?>? {
      val fnPtr = _1123081442_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<SetImageFeedResult?>>()
      val hr = fn.invokeHR(arrayOf(__1123081442_Ptr, marshalToNative(syndicationFeedUri), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<SetImageFeedResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun TryRemoveImageFeed(): Boolean {
      val fnPtr = _1123081442_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1123081442_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class ILockScreenImageFeedStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1123081442_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILockScreenImageFeedStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2c0d73f603a941a69b01495251ff51d5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILockScreenImageFeedStatics(ptr: Pointer?): WithDefault =
        ILockScreenImageFeedStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILockScreenImageFeedStatics {
      val address = segment.toRawLongValue()
      return makeILockScreenImageFeedStatics(Pointer(address))
    }

    public override fun toNative(obj: ILockScreenImageFeedStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1123081442_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILockScreenImageFeedStatics):
        Array<ILockScreenImageFeedStatics?> = (elements as
        Array<ILockScreenImageFeedStatics?>).castToImpl<ILockScreenImageFeedStatics,ILockScreenImageFeedStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILockScreenImageFeedStatics?> =
        arrayOfNulls<ILockScreenImageFeedStatics_Impl>(size) as Array<ILockScreenImageFeedStatics?>
  }
}
