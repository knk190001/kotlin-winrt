package Windows.UI.Input.Spatial

import Windows.Foundation.IAsyncOperation
import Windows.Perception.People.HandMeshObserver
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

@ABIMarker(ISpatialInteractionSource4.ABI::class)
@Signature("{0073bc4d-df66-5a91-a2ba-cea3e5c58a19}")
@Guid("0073bc4ddf665a91a2bacea3e5c58a19")
@WinRTInterface("0073bc4ddf665a91a2bacea3e5c58a19")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialInteractionSource4.ByReference::class)
public interface ISpatialInteractionSource4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun TryCreateHandMeshObserver(): HandMeshObserver?

  @InterfaceMethod(1)
  public fun TryCreateHandMeshObserverAsync(): IAsyncOperation<HandMeshObserver?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialInteractionSource4> {
    public override fun getValue() = ABI.makeISpatialInteractionSource4(pointer.getPointer(0))

    public fun setValue(value: ISpatialInteractionSource4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialInteractionSource4 {
    public val __1851771245_Ptr: Pointer?

    public val _1851771245_VtblPtr: Pointer?
      get() = __1851771245_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TryCreateHandMeshObserver(): HandMeshObserver? {
      val fnPtr = _1851771245_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HandMeshObserver>()
      val hr = fn.invokeHR(arrayOf(__1851771245_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HandMeshObserver>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun TryCreateHandMeshObserverAsync(): IAsyncOperation<HandMeshObserver?>? {
      val fnPtr = _1851771245_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<HandMeshObserver?>>()
      val hr = fn.invokeHR(arrayOf(__1851771245_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<HandMeshObserver?>>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialInteractionSource4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1851771245_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialInteractionSource4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0073bc4ddf665a91a2bacea3e5c58a19")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialInteractionSource4(ptr: Pointer?): WithDefault =
        ISpatialInteractionSource4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialInteractionSource4 {
      val address = segment.toRawLongValue()
      return makeISpatialInteractionSource4(Pointer(address))
    }

    public override fun toNative(obj: ISpatialInteractionSource4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1851771245_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialInteractionSource4):
        Array<ISpatialInteractionSource4?> = (elements as
        Array<ISpatialInteractionSource4?>).castToImpl<ISpatialInteractionSource4,ISpatialInteractionSource4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialInteractionSource4?> =
        arrayOfNulls<ISpatialInteractionSource4_Impl>(size) as Array<ISpatialInteractionSource4?>
  }
}
