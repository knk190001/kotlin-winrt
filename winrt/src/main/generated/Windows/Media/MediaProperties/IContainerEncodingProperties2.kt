package Windows.Media.MediaProperties

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

@ABIMarker(IContainerEncodingProperties2.ABI::class)
@Signature("{b272c029-ae26-4819-baad-ad7a49b0a876}")
@Guid("b272c029ae264819baadad7a49b0a876")
@WinRTInterface("b272c029ae264819baadad7a49b0a876")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContainerEncodingProperties2.ByReference::class)
public interface IContainerEncodingProperties2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Copy(): ContainerEncodingProperties?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContainerEncodingProperties2> {
    public override fun getValue() = ABI.makeIContainerEncodingProperties2(pointer.getPointer(0))

    public fun setValue(value: IContainerEncodingProperties2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContainerEncodingProperties2 {
    public val __2038822062_Ptr: Pointer?

    public val _2038822062_VtblPtr: Pointer?
      get() = __2038822062_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Copy(): ContainerEncodingProperties? {
      val fnPtr = _2038822062_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContainerEncodingProperties>()
      val hr = fn.invokeHR(arrayOf(__2038822062_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContainerEncodingProperties>(result.getValue())
      return resultValue
    }
  }

  public class IContainerEncodingProperties2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2038822062_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContainerEncodingProperties2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b272c029ae264819baadad7a49b0a876")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContainerEncodingProperties2(ptr: Pointer?): WithDefault =
        IContainerEncodingProperties2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContainerEncodingProperties2 {
      val address = segment.toRawLongValue()
      return makeIContainerEncodingProperties2(Pointer(address))
    }

    public override fun toNative(obj: IContainerEncodingProperties2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2038822062_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContainerEncodingProperties2):
        Array<IContainerEncodingProperties2?> = (elements as
        Array<IContainerEncodingProperties2?>).castToImpl<IContainerEncodingProperties2,IContainerEncodingProperties2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContainerEncodingProperties2?> =
        arrayOfNulls<IContainerEncodingProperties2_Impl>(size) as
        Array<IContainerEncodingProperties2?>
  }
}
