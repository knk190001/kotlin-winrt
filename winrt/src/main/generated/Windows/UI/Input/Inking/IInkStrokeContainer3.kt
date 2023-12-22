package Windows.UI.Input.Inking

import Windows.Foundation.IAsyncOperationWithProgress
import Windows.Storage.Streams.IOutputStream
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IInkStrokeContainer3.ABI::class)
@Signature("{3d07bea5-baea-4c82-a719-7b83da1067d2}")
@Guid("3d07bea5baea4c82a7197b83da1067d2")
@WinRTInterface("3d07bea5baea4c82a7197b83da1067d2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkStrokeContainer3.ByReference::class)
public interface IInkStrokeContainer3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SaveAsync(outputStream: IOutputStream?, inkPersistenceFormat: InkPersistenceFormat?):
      IAsyncOperationWithProgress<WinDef.UINT, WinDef.UINT>?

  @InterfaceMethod(1)
  public fun GetStrokeById(id: WinDef.UINT): InkStroke?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkStrokeContainer3> {
    public override fun getValue() = ABI.makeIInkStrokeContainer3(pointer.getPointer(0))

    public fun setValue(value: IInkStrokeContainer3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkStrokeContainer3 {
    public val __1109615702_Ptr: Pointer?

    public val _1109615702_VtblPtr: Pointer?
      get() = __1109615702_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SaveAsync(outputStream: IOutputStream?,
        inkPersistenceFormat: InkPersistenceFormat?): IAsyncOperationWithProgress<WinDef.UINT,
        WinDef.UINT>? {
      val fnPtr = _1109615702_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<WinDef.UINT, WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__1109615702_Ptr, marshalToNative(outputStream),
          marshalToNative(inkPersistenceFormat), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<WinDef.UINT,
          WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetStrokeById(id: WinDef.UINT): InkStroke? {
      val fnPtr = _1109615702_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkStroke>()
      val hr = fn.invokeHR(arrayOf(__1109615702_Ptr, id, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkStroke>(result.getValue())
      return resultValue
    }
  }

  public class IInkStrokeContainer3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1109615702_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkStrokeContainer3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3d07bea5baea4c82a7197b83da1067d2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkStrokeContainer3(ptr: Pointer?): WithDefault = IInkStrokeContainer3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkStrokeContainer3 {
      val address = segment.toRawLongValue()
      return makeIInkStrokeContainer3(Pointer(address))
    }

    public override fun toNative(obj: IInkStrokeContainer3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1109615702_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkStrokeContainer3): Array<IInkStrokeContainer3?> =
        (elements as
        Array<IInkStrokeContainer3?>).castToImpl<IInkStrokeContainer3,IInkStrokeContainer3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkStrokeContainer3?> =
        arrayOfNulls<IInkStrokeContainer3_Impl>(size) as Array<IInkStrokeContainer3?>
  }
}
