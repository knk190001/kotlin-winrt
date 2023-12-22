package Windows.ApplicationModel.Background

import Windows.Storage.Provider.CachedFileTarget
import Windows.Storage.Provider.FileUpdateRequest
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

@ABIMarker(ICachedFileUpdaterTriggerDetails.ABI::class)
@Signature("{71838c13-1314-47b4-9597-dc7e248c17cc}")
@Guid("71838c13131447b49597dc7e248c17cc")
@WinRTInterface("71838c13131447b49597dc7e248c17cc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICachedFileUpdaterTriggerDetails.ByReference::class)
public interface ICachedFileUpdaterTriggerDetails : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_UpdateTarget(): CachedFileTarget?

  @InterfaceMethod(1)
  public fun get_UpdateRequest(): FileUpdateRequest?

  @InterfaceMethod(2)
  public fun get_CanRequestUserInput(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICachedFileUpdaterTriggerDetails> {
    public override fun getValue() = ABI.makeICachedFileUpdaterTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: ICachedFileUpdaterTriggerDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICachedFileUpdaterTriggerDetails {
    public val __1470419812_Ptr: Pointer?

    public val _1470419812_VtblPtr: Pointer?
      get() = __1470419812_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_UpdateTarget(): CachedFileTarget? {
      val fnPtr = _1470419812_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CachedFileTarget>()
      val hr = fn.invokeHR(arrayOf(__1470419812_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CachedFileTarget>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_UpdateRequest(): FileUpdateRequest? {
      val fnPtr = _1470419812_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FileUpdateRequest>()
      val hr = fn.invokeHR(arrayOf(__1470419812_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FileUpdateRequest>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_CanRequestUserInput(): Boolean {
      val fnPtr = _1470419812_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1470419812_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class ICachedFileUpdaterTriggerDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1470419812_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICachedFileUpdaterTriggerDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("71838c13131447b49597dc7e248c17cc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICachedFileUpdaterTriggerDetails(ptr: Pointer?): WithDefault =
        ICachedFileUpdaterTriggerDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICachedFileUpdaterTriggerDetails {
      val address = segment.toRawLongValue()
      return makeICachedFileUpdaterTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: ICachedFileUpdaterTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1470419812_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICachedFileUpdaterTriggerDetails):
        Array<ICachedFileUpdaterTriggerDetails?> = (elements as
        Array<ICachedFileUpdaterTriggerDetails?>).castToImpl<ICachedFileUpdaterTriggerDetails,ICachedFileUpdaterTriggerDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICachedFileUpdaterTriggerDetails?> =
        arrayOfNulls<ICachedFileUpdaterTriggerDetails_Impl>(size) as
        Array<ICachedFileUpdaterTriggerDetails?>
  }
}
