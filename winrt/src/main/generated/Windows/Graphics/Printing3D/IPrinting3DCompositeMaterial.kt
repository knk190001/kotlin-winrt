package Windows.Graphics.Printing3D

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

@ABIMarker(IPrinting3DCompositeMaterial.ABI::class)
@Signature("{462238dd-562e-4f6c-882d-f4d841fd63c7}")
@Guid("462238dd562e4f6c882df4d841fd63c7")
@WinRTInterface("462238dd562e4f6c882df4d841fd63c7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrinting3DCompositeMaterial.ByReference::class)
public interface IPrinting3DCompositeMaterial : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Values(): IVector<Double>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrinting3DCompositeMaterial> {
    public override fun getValue() = ABI.makeIPrinting3DCompositeMaterial(pointer.getPointer(0))

    public fun setValue(value: IPrinting3DCompositeMaterial_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrinting3DCompositeMaterial {
    public val __358647197_Ptr: Pointer?

    public val _358647197_VtblPtr: Pointer?
      get() = __358647197_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Values(): IVector<Double>? {
      val fnPtr = _358647197_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<Double>>()
      val hr = fn.invokeHR(arrayOf(__358647197_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<Double>>(result.getValue())
      return resultValue
    }
  }

  public class IPrinting3DCompositeMaterial_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __358647197_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrinting3DCompositeMaterial, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("462238dd562e4f6c882df4d841fd63c7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrinting3DCompositeMaterial(ptr: Pointer?): WithDefault =
        IPrinting3DCompositeMaterial_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrinting3DCompositeMaterial {
      val address = segment.toRawLongValue()
      return makeIPrinting3DCompositeMaterial(Pointer(address))
    }

    public override fun toNative(obj: IPrinting3DCompositeMaterial): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__358647197_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrinting3DCompositeMaterial):
        Array<IPrinting3DCompositeMaterial?> = (elements as
        Array<IPrinting3DCompositeMaterial?>).castToImpl<IPrinting3DCompositeMaterial,IPrinting3DCompositeMaterial_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrinting3DCompositeMaterial?> =
        arrayOfNulls<IPrinting3DCompositeMaterial_Impl>(size) as
        Array<IPrinting3DCompositeMaterial?>
  }
}
