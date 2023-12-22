package Windows.Devices.Perception.Provider

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

@ABIMarker(IKnownPerceptionFrameKindStatics.ABI::class)
@Signature("{3ae651d6-9669-4106-9fae-4835c1b96104}")
@Guid("3ae651d6966941069fae4835c1b96104")
@WinRTInterface("3ae651d6966941069fae4835c1b96104")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKnownPerceptionFrameKindStatics.ByReference::class)
public interface IKnownPerceptionFrameKindStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Color(): String?

  @InterfaceMethod(1)
  public fun get_Depth(): String?

  @InterfaceMethod(2)
  public fun get_Infrared(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IKnownPerceptionFrameKindStatics> {
    public override fun getValue() = ABI.makeIKnownPerceptionFrameKindStatics(pointer.getPointer(0))

    public fun setValue(value: IKnownPerceptionFrameKindStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKnownPerceptionFrameKindStatics {
    public val __945359393_Ptr: Pointer?

    public val _945359393_VtblPtr: Pointer?
      get() = __945359393_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Color(): String? {
      val fnPtr = _945359393_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__945359393_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Depth(): String? {
      val fnPtr = _945359393_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__945359393_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Infrared(): String? {
      val fnPtr = _945359393_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__945359393_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IKnownPerceptionFrameKindStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __945359393_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKnownPerceptionFrameKindStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3ae651d6966941069fae4835c1b96104")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKnownPerceptionFrameKindStatics(ptr: Pointer?): WithDefault =
        IKnownPerceptionFrameKindStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IKnownPerceptionFrameKindStatics {
      val address = segment.toRawLongValue()
      return makeIKnownPerceptionFrameKindStatics(Pointer(address))
    }

    public override fun toNative(obj: IKnownPerceptionFrameKindStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__945359393_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKnownPerceptionFrameKindStatics):
        Array<IKnownPerceptionFrameKindStatics?> = (elements as
        Array<IKnownPerceptionFrameKindStatics?>).castToImpl<IKnownPerceptionFrameKindStatics,IKnownPerceptionFrameKindStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKnownPerceptionFrameKindStatics?> =
        arrayOfNulls<IKnownPerceptionFrameKindStatics_Impl>(size) as
        Array<IKnownPerceptionFrameKindStatics?>
  }
}
