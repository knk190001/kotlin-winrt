package Microsoft.UI.Input.Experimental

import Microsoft.UI.Input.IPointerPointTransform
import Microsoft.UI.Input.PointerPoint
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

@ABIMarker(IExpPointerPointStatics.ABI::class)
@Signature("{fae05d62-8e52-5bf5-a577-ff07bb15e031}")
@Guid("fae05d628e525bf5a577ff07bb15e031")
@WinRTInterface("fae05d628e525bf5a577ff07bb15e031")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IExpPointerPointStatics.ByReference::class)
public interface IExpPointerPointStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetCurrentPoint(pointerId: WinDef.UINT): PointerPoint?

  @InterfaceMethod(1)
  public fun GetCurrentPointTransformed(pointerId: WinDef.UINT, transform: IPointerPointTransform?):
      PointerPoint?

  @InterfaceMethod(2)
  public fun GetIntermediatePoints(pointerId: WinDef.UINT): IVector<PointerPoint?>?

  @InterfaceMethod(3)
  public fun GetIntermediatePointsTransformed(pointerId: WinDef.UINT,
      transform: IPointerPointTransform?): IVector<PointerPoint?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IExpPointerPointStatics> {
    public override fun getValue() = ABI.makeIExpPointerPointStatics(pointer.getPointer(0))

    public fun setValue(value: IExpPointerPointStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IExpPointerPointStatics {
    public val __1419967800_Ptr: Pointer?

    public val _1419967800_VtblPtr: Pointer?
      get() = __1419967800_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetCurrentPoint(pointerId: WinDef.UINT): PointerPoint? {
      val fnPtr = _1419967800_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PointerPoint>()
      val hr = fn.invokeHR(arrayOf(__1419967800_Ptr, pointerId, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PointerPoint>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetCurrentPointTransformed(pointerId: WinDef.UINT,
        transform: IPointerPointTransform?): PointerPoint? {
      val fnPtr = _1419967800_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PointerPoint>()
      val hr = fn.invokeHR(arrayOf(__1419967800_Ptr, pointerId, marshalToNative(transform), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PointerPoint>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetIntermediatePoints(pointerId: WinDef.UINT): IVector<PointerPoint?>? {
      val fnPtr = _1419967800_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<PointerPoint?>>()
      val hr = fn.invokeHR(arrayOf(__1419967800_Ptr, pointerId, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<PointerPoint?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetIntermediatePointsTransformed(pointerId: WinDef.UINT,
        transform: IPointerPointTransform?): IVector<PointerPoint?>? {
      val fnPtr = _1419967800_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<PointerPoint?>>()
      val hr = fn.invokeHR(arrayOf(__1419967800_Ptr, pointerId, marshalToNative(transform), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<PointerPoint?>>(result.getValue())
      return resultValue
    }
  }

  public class IExpPointerPointStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1419967800_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IExpPointerPointStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fae05d628e525bf5a577ff07bb15e031")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIExpPointerPointStatics(ptr: Pointer?): WithDefault =
        IExpPointerPointStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IExpPointerPointStatics {
      val address = segment.toRawLongValue()
      return makeIExpPointerPointStatics(Pointer(address))
    }

    public override fun toNative(obj: IExpPointerPointStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1419967800_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IExpPointerPointStatics): Array<IExpPointerPointStatics?>
        = (elements as
        Array<IExpPointerPointStatics?>).castToImpl<IExpPointerPointStatics,IExpPointerPointStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IExpPointerPointStatics?> =
        arrayOfNulls<IExpPointerPointStatics_Impl>(size) as Array<IExpPointerPointStatics?>
  }
}
