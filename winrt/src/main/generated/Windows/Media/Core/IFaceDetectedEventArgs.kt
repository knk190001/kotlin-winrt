package Windows.Media.Core

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

@ABIMarker(IFaceDetectedEventArgs.ABI::class)
@Signature("{19918426-c65b-46ba-85f8-13880576c90a}")
@Guid("19918426c65b46ba85f813880576c90a")
@WinRTInterface("19918426c65b46ba85f813880576c90a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFaceDetectedEventArgs.ByReference::class)
public interface IFaceDetectedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ResultFrame(): FaceDetectionEffectFrame?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFaceDetectedEventArgs> {
    public override fun getValue() = ABI.makeIFaceDetectedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IFaceDetectedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFaceDetectedEventArgs {
    public val __1542428067_Ptr: Pointer?

    public val _1542428067_VtblPtr: Pointer?
      get() = __1542428067_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ResultFrame(): FaceDetectionEffectFrame? {
      val fnPtr = _1542428067_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FaceDetectionEffectFrame>()
      val hr = fn.invokeHR(arrayOf(__1542428067_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FaceDetectionEffectFrame>(result.getValue())
      return resultValue
    }
  }

  public class IFaceDetectedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1542428067_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFaceDetectedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("19918426c65b46ba85f813880576c90a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFaceDetectedEventArgs(ptr: Pointer?): WithDefault =
        IFaceDetectedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFaceDetectedEventArgs {
      val address = segment.toRawLongValue()
      return makeIFaceDetectedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IFaceDetectedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1542428067_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFaceDetectedEventArgs): Array<IFaceDetectedEventArgs?> =
        (elements as
        Array<IFaceDetectedEventArgs?>).castToImpl<IFaceDetectedEventArgs,IFaceDetectedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFaceDetectedEventArgs?> =
        arrayOfNulls<IFaceDetectedEventArgs_Impl>(size) as Array<IFaceDetectedEventArgs?>
  }
}
