package Windows.Media.Devices

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncAction
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

@ABIMarker(ISceneModeControl.ABI::class)
@Signature("{d48e5af7-8d59-4854-8c62-12c70ba89b7c}")
@Guid("d48e5af78d5948548c6212c70ba89b7c")
@WinRTInterface("d48e5af78d5948548c6212c70ba89b7c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISceneModeControl.ByReference::class)
public interface ISceneModeControl : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SupportedModes(): IVectorView<CaptureSceneMode?>?

  @InterfaceMethod(1)
  public fun get_Value(): CaptureSceneMode?

  @InterfaceMethod(2)
  public fun SetValueAsync(sceneMode: CaptureSceneMode?): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISceneModeControl> {
    public override fun getValue() = ABI.makeISceneModeControl(pointer.getPointer(0))

    public fun setValue(value: ISceneModeControl_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISceneModeControl {
    public val __570489553_Ptr: Pointer?

    public val _570489553_VtblPtr: Pointer?
      get() = __570489553_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SupportedModes(): IVectorView<CaptureSceneMode?>? {
      val fnPtr = _570489553_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<CaptureSceneMode?>>()
      val hr = fn.invokeHR(arrayOf(__570489553_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<CaptureSceneMode?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Value(): CaptureSceneMode? {
      val fnPtr = _570489553_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CaptureSceneMode>()
      val hr = fn.invokeHR(arrayOf(__570489553_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CaptureSceneMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun SetValueAsync(sceneMode: CaptureSceneMode?): IAsyncAction? {
      val fnPtr = _570489553_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__570489553_Ptr, marshalToNative(sceneMode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class ISceneModeControl_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __570489553_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISceneModeControl, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d48e5af78d5948548c6212c70ba89b7c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISceneModeControl(ptr: Pointer?): WithDefault = ISceneModeControl_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISceneModeControl {
      val address = segment.toRawLongValue()
      return makeISceneModeControl(Pointer(address))
    }

    public override fun toNative(obj: ISceneModeControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__570489553_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISceneModeControl): Array<ISceneModeControl?> = (elements
        as Array<ISceneModeControl?>).castToImpl<ISceneModeControl,ISceneModeControl_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISceneModeControl?> =
        arrayOfNulls<ISceneModeControl_Impl>(size) as Array<ISceneModeControl?>
  }
}
