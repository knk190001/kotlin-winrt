package Windows.Media.Core

import Windows.Media.Effects.IVideoEffectDefinition
import Windows.Media.Effects.IVideoEffectDefinition.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IFaceDetectionEffectDefinition.ABI::class)
@Signature("{43dca081-b848-4f33-b702-1fd2624fb016}")
@Guid("43dca081b8484f33b7021fd2624fb016")
@WinRTInterface("43dca081b8484f33b7021fd2624fb016")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFaceDetectionEffectDefinition.ByReference::class)
public interface IFaceDetectionEffectDefinition : NativeMapped, IWinRTInterface,
    IVideoEffectDefinition {
  @InterfaceMethod(0)
  public fun put_DetectionMode(value: FaceDetectionMode?): Unit

  @InterfaceMethod(1)
  public fun get_DetectionMode(): FaceDetectionMode?

  @InterfaceMethod(2)
  public fun put_SynchronousDetectionEnabled(value: Boolean): Unit

  @InterfaceMethod(3)
  public fun get_SynchronousDetectionEnabled(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFaceDetectionEffectDefinition> {
    public override fun getValue() = ABI.makeIFaceDetectionEffectDefinition(pointer.getPointer(0))

    public fun setValue(value: IFaceDetectionEffectDefinition_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFaceDetectionEffectDefinition, IVideoEffectDefinition.WithDefault
      {
    public val __1996906455_Ptr: Pointer?

    public val _1996906455_VtblPtr: Pointer?
      get() = __1996906455_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_DetectionMode(value: FaceDetectionMode?): Unit {
      val fnPtr = _1996906455_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1996906455_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_DetectionMode(): FaceDetectionMode? {
      val fnPtr = _1996906455_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FaceDetectionMode>()
      val hr = fn.invokeHR(arrayOf(__1996906455_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FaceDetectionMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_SynchronousDetectionEnabled(value: Boolean): Unit {
      val fnPtr = _1996906455_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1996906455_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_SynchronousDetectionEnabled(): Boolean {
      val fnPtr = _1996906455_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1996906455_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IFaceDetectionEffectDefinition_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IVideoEffectDefinition {
    public override val __1115276221_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1996906455_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1996906455_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFaceDetectionEffectDefinition, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("43dca081b8484f33b7021fd2624fb016")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFaceDetectionEffectDefinition(ptr: Pointer?): WithDefault =
        IFaceDetectionEffectDefinition_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFaceDetectionEffectDefinition {
      val address = segment.toRawLongValue()
      return makeIFaceDetectionEffectDefinition(Pointer(address))
    }

    public override fun toNative(obj: IFaceDetectionEffectDefinition): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1996906455_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFaceDetectionEffectDefinition):
        Array<IFaceDetectionEffectDefinition?> = (elements as
        Array<IFaceDetectionEffectDefinition?>).castToImpl<IFaceDetectionEffectDefinition,IFaceDetectionEffectDefinition_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFaceDetectionEffectDefinition?> =
        arrayOfNulls<IFaceDetectionEffectDefinition_Impl>(size) as
        Array<IFaceDetectionEffectDefinition?>
  }
}
