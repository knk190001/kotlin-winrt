package Windows.UI.Shell

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
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

@ABIMarker(IShareWindowCommandSource.ABI::class)
@Signature("{cb3b7ae3-6b9c-561e-bccc-61e68e0abfef}")
@Guid("cb3b7ae36b9c561ebccc61e68e0abfef")
@WinRTInterface("cb3b7ae36b9c561ebccc61e68e0abfef")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IShareWindowCommandSource.ByReference::class)
public interface IShareWindowCommandSource : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Start(): Unit

  @InterfaceMethod(1)
  public fun Stop(): Unit

  @InterfaceMethod(2)
  public fun ReportCommandChanged(): Unit

  @InterfaceMethod(3)
  public fun add_CommandRequested(handler: TypedEventHandler<ShareWindowCommandSource?,
      ShareWindowCommandEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_CommandRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(5)
  public fun add_CommandInvoked(handler: TypedEventHandler<ShareWindowCommandSource?,
      ShareWindowCommandEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(6)
  public fun remove_CommandInvoked(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IShareWindowCommandSource> {
    public override fun getValue() = ABI.makeIShareWindowCommandSource(pointer.getPointer(0))

    public fun setValue(value: IShareWindowCommandSource_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IShareWindowCommandSource {
    public val __97601025_Ptr: Pointer?

    public val _97601025_VtblPtr: Pointer?
      get() = __97601025_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Start(): Unit {
      val fnPtr = _97601025_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__97601025_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun Stop(): Unit {
      val fnPtr = _97601025_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__97601025_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun ReportCommandChanged(): Unit {
      val fnPtr = _97601025_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__97601025_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun add_CommandRequested(handler: TypedEventHandler<ShareWindowCommandSource?,
        ShareWindowCommandEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _97601025_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__97601025_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_CommandRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _97601025_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__97601025_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun add_CommandInvoked(handler: TypedEventHandler<ShareWindowCommandSource?,
        ShareWindowCommandEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _97601025_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__97601025_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun remove_CommandInvoked(token: EventRegistrationToken?): Unit {
      val fnPtr = _97601025_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__97601025_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IShareWindowCommandSource_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __97601025_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IShareWindowCommandSource, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cb3b7ae36b9c561ebccc61e68e0abfef")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIShareWindowCommandSource(ptr: Pointer?): WithDefault =
        IShareWindowCommandSource_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IShareWindowCommandSource {
      val address = segment.toRawLongValue()
      return makeIShareWindowCommandSource(Pointer(address))
    }

    public override fun toNative(obj: IShareWindowCommandSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__97601025_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IShareWindowCommandSource):
        Array<IShareWindowCommandSource?> = (elements as
        Array<IShareWindowCommandSource?>).castToImpl<IShareWindowCommandSource,IShareWindowCommandSource_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IShareWindowCommandSource?> =
        arrayOfNulls<IShareWindowCommandSource_Impl>(size) as Array<IShareWindowCommandSource?>
  }
}
