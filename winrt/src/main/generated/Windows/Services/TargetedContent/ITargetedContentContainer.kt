package Windows.Services.TargetedContent

import Windows.Foundation.DateTime
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

@ABIMarker(ITargetedContentContainer.ABI::class)
@Signature("{bc2494c9-8837-47c2-850f-d79d64595926}")
@Guid("bc2494c9883747c2850fd79d64595926")
@WinRTInterface("bc2494c9883747c2850fd79d64595926")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITargetedContentContainer.ByReference::class)
public interface ITargetedContentContainer : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): String?

  @InterfaceMethod(1)
  public fun get_Timestamp(): DateTime?

  @InterfaceMethod(2)
  public fun get_Availability(): TargetedContentAvailability?

  @InterfaceMethod(3)
  public fun get_Content(): TargetedContentCollection?

  @InterfaceMethod(4)
  public fun SelectSingleObject(path: String?): TargetedContentObject?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITargetedContentContainer> {
    public override fun getValue() = ABI.makeITargetedContentContainer(pointer.getPointer(0))

    public fun setValue(value: ITargetedContentContainer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITargetedContentContainer {
    public val __302983165_Ptr: Pointer?

    public val _302983165_VtblPtr: Pointer?
      get() = __302983165_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): String? {
      val fnPtr = _302983165_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__302983165_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Timestamp(): DateTime? {
      val fnPtr = _302983165_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__302983165_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Availability(): TargetedContentAvailability? {
      val fnPtr = _302983165_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TargetedContentAvailability>()
      val hr = fn.invokeHR(arrayOf(__302983165_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TargetedContentAvailability>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Content(): TargetedContentCollection? {
      val fnPtr = _302983165_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TargetedContentCollection>()
      val hr = fn.invokeHR(arrayOf(__302983165_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TargetedContentCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun SelectSingleObject(path: String?): TargetedContentObject? {
      val fnPtr = _302983165_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TargetedContentObject>()
      val hr = fn.invokeHR(arrayOf(__302983165_Ptr, marshalToNative(path), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TargetedContentObject>(result.getValue())
      return resultValue
    }
  }

  public class ITargetedContentContainer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __302983165_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITargetedContentContainer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bc2494c9883747c2850fd79d64595926")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITargetedContentContainer(ptr: Pointer?): WithDefault =
        ITargetedContentContainer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITargetedContentContainer {
      val address = segment.toRawLongValue()
      return makeITargetedContentContainer(Pointer(address))
    }

    public override fun toNative(obj: ITargetedContentContainer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__302983165_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITargetedContentContainer):
        Array<ITargetedContentContainer?> = (elements as
        Array<ITargetedContentContainer?>).castToImpl<ITargetedContentContainer,ITargetedContentContainer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITargetedContentContainer?> =
        arrayOfNulls<ITargetedContentContainer_Impl>(size) as Array<ITargetedContentContainer?>
  }
}
