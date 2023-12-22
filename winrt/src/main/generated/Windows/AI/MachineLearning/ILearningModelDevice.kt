package Windows.AI.MachineLearning

import Windows.Graphics.DirectX.Direct3D11.IDirect3DDevice
import Windows.Graphics.DisplayAdapterId
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

@ABIMarker(ILearningModelDevice.ABI::class)
@Signature("{f5c2c8fe-3f56-4a8c-ac5f-fdb92d8b8252}")
@Guid("f5c2c8fe3f564a8cac5ffdb92d8b8252")
@WinRTInterface("f5c2c8fe3f564a8cac5ffdb92d8b8252")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILearningModelDevice.ByReference::class)
public interface ILearningModelDevice : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AdapterId(): DisplayAdapterId?

  @InterfaceMethod(1)
  public fun get_Direct3D11Device(): IDirect3DDevice?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILearningModelDevice> {
    public override fun getValue() = ABI.makeILearningModelDevice(pointer.getPointer(0))

    public fun setValue(value: ILearningModelDevice_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILearningModelDevice {
    public val __889104610_Ptr: Pointer?

    public val _889104610_VtblPtr: Pointer?
      get() = __889104610_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AdapterId(): DisplayAdapterId? {
      val fnPtr = _889104610_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayAdapterId>()
      val hr = fn.invokeHR(arrayOf(__889104610_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayAdapterId>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Direct3D11Device(): IDirect3DDevice? {
      val fnPtr = _889104610_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IDirect3DDevice>()
      val hr = fn.invokeHR(arrayOf(__889104610_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IDirect3DDevice>(result.getValue())
      return resultValue
    }
  }

  public class ILearningModelDevice_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __889104610_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILearningModelDevice, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f5c2c8fe3f564a8cac5ffdb92d8b8252")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILearningModelDevice(ptr: Pointer?): WithDefault = ILearningModelDevice_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILearningModelDevice {
      val address = segment.toRawLongValue()
      return makeILearningModelDevice(Pointer(address))
    }

    public override fun toNative(obj: ILearningModelDevice): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__889104610_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILearningModelDevice): Array<ILearningModelDevice?> =
        (elements as
        Array<ILearningModelDevice?>).castToImpl<ILearningModelDevice,ILearningModelDevice_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILearningModelDevice?> =
        arrayOfNulls<ILearningModelDevice_Impl>(size) as Array<ILearningModelDevice?>
  }
}
