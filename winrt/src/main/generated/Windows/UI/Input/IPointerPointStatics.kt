package Windows.UI.Input

import Windows.Foundation.Collections.IVector
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

@ABIMarker(IPointerPointStatics.ABI::class)
@Signature("{a506638d-2a1a-413e-bc75-9f38381cc069}")
@Guid("a506638d2a1a413ebc759f38381cc069")
@WinRTInterface("a506638d2a1a413ebc759f38381cc069")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPointerPointStatics.ByReference::class)
public interface IPointerPointStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetCurrentPoint(pointerId: WinDef.UINT): PointerPoint?

  @InterfaceMethod(1)
  public fun GetIntermediatePoints(pointerId: WinDef.UINT): IVector<PointerPoint?>?

  @InterfaceMethod(2)
  public fun GetCurrentPoint(pointerId: WinDef.UINT, transform: IPointerPointTransform?):
      PointerPoint?

  @InterfaceMethod(3)
  public fun GetIntermediatePoints(pointerId: WinDef.UINT, transform: IPointerPointTransform?):
      IVector<PointerPoint?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPointerPointStatics> {
    public override fun getValue() = ABI.makeIPointerPointStatics(pointer.getPointer(0))

    public fun setValue(value: IPointerPointStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPointerPointStatics {
    public val __1529181028_Ptr: Pointer?

    public val _1529181028_VtblPtr: Pointer?
      get() = __1529181028_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetCurrentPoint(pointerId: WinDef.UINT): PointerPoint? {
      val fnPtr = _1529181028_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PointerPoint>()
      val hr = fn.invokeHR(arrayOf(__1529181028_Ptr, pointerId, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PointerPoint>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetIntermediatePoints(pointerId: WinDef.UINT): IVector<PointerPoint?>? {
      val fnPtr = _1529181028_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<PointerPoint?>>()
      val hr = fn.invokeHR(arrayOf(__1529181028_Ptr, pointerId, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<PointerPoint?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetCurrentPoint(pointerId: WinDef.UINT, transform: IPointerPointTransform?):
        PointerPoint? {
      val fnPtr = _1529181028_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PointerPoint>()
      val hr = fn.invokeHR(arrayOf(__1529181028_Ptr, pointerId, marshalToNative(transform), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PointerPoint>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetIntermediatePoints(pointerId: WinDef.UINT,
        transform: IPointerPointTransform?): IVector<PointerPoint?>? {
      val fnPtr = _1529181028_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<PointerPoint?>>()
      val hr = fn.invokeHR(arrayOf(__1529181028_Ptr, pointerId, marshalToNative(transform), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<PointerPoint?>>(result.getValue())
      return resultValue
    }
  }

  public class IPointerPointStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1529181028_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPointerPointStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a506638d2a1a413ebc759f38381cc069")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPointerPointStatics(ptr: Pointer?): WithDefault = IPointerPointStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPointerPointStatics {
      val address = segment.toRawLongValue()
      return makeIPointerPointStatics(Pointer(address))
    }

    public override fun toNative(obj: IPointerPointStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1529181028_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPointerPointStatics): Array<IPointerPointStatics?> =
        (elements as
        Array<IPointerPointStatics?>).castToImpl<IPointerPointStatics,IPointerPointStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPointerPointStatics?> =
        arrayOfNulls<IPointerPointStatics_Impl>(size) as Array<IPointerPointStatics?>
  }
}
