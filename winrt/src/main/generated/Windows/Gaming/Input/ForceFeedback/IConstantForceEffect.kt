package Windows.Gaming.Input.ForceFeedback

import Windows.Foundation.Numerics.Vector3
import Windows.Foundation.TimeSpan
import Windows.Gaming.Input.ForceFeedback.IForceFeedbackEffect.ABI.IID
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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IConstantForceEffect.ABI::class)
@Signature("{9bfa0140-f3c7-415c-b068-0f068734bce0}")
@Guid("9bfa0140f3c7415cb0680f068734bce0")
@WinRTInterface("9bfa0140f3c7415cb0680f068734bce0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IConstantForceEffect.ByReference::class)
public interface IConstantForceEffect : NativeMapped, IWinRTInterface, IForceFeedbackEffect {
  @InterfaceMethod(0)
  public fun SetParameters(vector: Vector3?, duration: TimeSpan?): Unit

  @InterfaceMethod(1)
  public fun SetParametersWithEnvelope(
    vector: Vector3?,
    attackGain: Float,
    sustainGain: Float,
    releaseGain: Float,
    startDelay: TimeSpan?,
    attackDuration: TimeSpan?,
    sustainDuration: TimeSpan?,
    releaseDuration: TimeSpan?,
    repeatCount: WinDef.UINT
  ): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IConstantForceEffect> {
    public override fun getValue() = ABI.makeIConstantForceEffect(pointer.getPointer(0))

    public fun setValue(value: IConstantForceEffect_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IConstantForceEffect, IForceFeedbackEffect.WithDefault {
    public val __83005831_Ptr: Pointer?

    public val _83005831_VtblPtr: Pointer?
      get() = __83005831_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SetParameters(vector: Vector3?, duration: TimeSpan?): Unit {
      val fnPtr = _83005831_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__83005831_Ptr, marshalToNative(vector),
          marshalToNative(duration),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun SetParametersWithEnvelope(
      vector: Vector3?,
      attackGain: Float,
      sustainGain: Float,
      releaseGain: Float,
      startDelay: TimeSpan?,
      attackDuration: TimeSpan?,
      sustainDuration: TimeSpan?,
      releaseDuration: TimeSpan?,
      repeatCount: WinDef.UINT
    ): Unit {
      val fnPtr = _83005831_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__83005831_Ptr, marshalToNative(vector), attackGain, sustainGain,
          releaseGain, marshalToNative(startDelay), marshalToNative(attackDuration),
          marshalToNative(sustainDuration), marshalToNative(releaseDuration), repeatCount,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IConstantForceEffect_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IForceFeedbackEffect {
    public override val __455352496_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_83005831_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __83005831_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IConstantForceEffect, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9bfa0140f3c7415cb0680f068734bce0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIConstantForceEffect(ptr: Pointer?): WithDefault = IConstantForceEffect_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IConstantForceEffect {
      val address = segment.toRawLongValue()
      return makeIConstantForceEffect(Pointer(address))
    }

    public override fun toNative(obj: IConstantForceEffect): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__83005831_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IConstantForceEffect): Array<IConstantForceEffect?> =
        (elements as
        Array<IConstantForceEffect?>).castToImpl<IConstantForceEffect,IConstantForceEffect_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IConstantForceEffect?> =
        arrayOfNulls<IConstantForceEffect_Impl>(size) as Array<IConstantForceEffect?>
  }
}
