package Windows.Graphics.Printing3D

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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPrinting3DFaceReductionOptions.ABI::class)
@Signature("{bbfed397-2d74-46f7-be85-99a67bbb6629}")
@Guid("bbfed3972d7446f7be8599a67bbb6629")
@WinRTInterface("bbfed3972d7446f7be8599a67bbb6629")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrinting3DFaceReductionOptions.ByReference::class)
public interface IPrinting3DFaceReductionOptions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MaxReductionArea(): Double

  @InterfaceMethod(1)
  public fun put_MaxReductionArea(value: Double): Unit

  @InterfaceMethod(2)
  public fun get_TargetTriangleCount(): WinDef.UINT

  @InterfaceMethod(3)
  public fun put_TargetTriangleCount(value: WinDef.UINT): Unit

  @InterfaceMethod(4)
  public fun get_MaxEdgeLength(): Double

  @InterfaceMethod(5)
  public fun put_MaxEdgeLength(value: Double): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrinting3DFaceReductionOptions> {
    public override fun getValue() = ABI.makeIPrinting3DFaceReductionOptions(pointer.getPointer(0))

    public fun setValue(value: IPrinting3DFaceReductionOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrinting3DFaceReductionOptions {
    public val __529437191_Ptr: Pointer?

    public val _529437191_VtblPtr: Pointer?
      get() = __529437191_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MaxReductionArea(): Double {
      val fnPtr = _529437191_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__529437191_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_MaxReductionArea(value: Double): Unit {
      val fnPtr = _529437191_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__529437191_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_TargetTriangleCount(): WinDef.UINT {
      val fnPtr = _529437191_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__529437191_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_TargetTriangleCount(value: WinDef.UINT): Unit {
      val fnPtr = _529437191_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__529437191_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_MaxEdgeLength(): Double {
      val fnPtr = _529437191_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__529437191_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_MaxEdgeLength(value: Double): Unit {
      val fnPtr = _529437191_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__529437191_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPrinting3DFaceReductionOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __529437191_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrinting3DFaceReductionOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bbfed3972d7446f7be8599a67bbb6629")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrinting3DFaceReductionOptions(ptr: Pointer?): WithDefault =
        IPrinting3DFaceReductionOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrinting3DFaceReductionOptions {
      val address = segment.toRawLongValue()
      return makeIPrinting3DFaceReductionOptions(Pointer(address))
    }

    public override fun toNative(obj: IPrinting3DFaceReductionOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__529437191_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrinting3DFaceReductionOptions):
        Array<IPrinting3DFaceReductionOptions?> = (elements as
        Array<IPrinting3DFaceReductionOptions?>).castToImpl<IPrinting3DFaceReductionOptions,IPrinting3DFaceReductionOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrinting3DFaceReductionOptions?> =
        arrayOfNulls<IPrinting3DFaceReductionOptions_Impl>(size) as
        Array<IPrinting3DFaceReductionOptions?>
  }
}
