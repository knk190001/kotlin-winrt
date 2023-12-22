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

@ABIMarker(IPrinting3DMultiplePropertyMaterial.ABI::class)
@Signature("{25a6254b-c6e9-484d-a214-a25e5776ba62}")
@Guid("25a6254bc6e9484da214a25e5776ba62")
@WinRTInterface("25a6254bc6e9484da214a25e5776ba62")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrinting3DMultiplePropertyMaterial.ByReference::class)
public interface IPrinting3DMultiplePropertyMaterial : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MaterialIndices(): IVector<WinDef.UINT>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrinting3DMultiplePropertyMaterial> {
    public override fun getValue() =
        ABI.makeIPrinting3DMultiplePropertyMaterial(pointer.getPointer(0))

    public fun setValue(value: IPrinting3DMultiplePropertyMaterial_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrinting3DMultiplePropertyMaterial {
    public val __1842588515_Ptr: Pointer?

    public val _1842588515_VtblPtr: Pointer?
      get() = __1842588515_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MaterialIndices(): IVector<WinDef.UINT>? {
      val fnPtr = _1842588515_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__1842588515_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<WinDef.UINT>>(result.getValue())
      return resultValue
    }
  }

  public class IPrinting3DMultiplePropertyMaterial_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1842588515_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrinting3DMultiplePropertyMaterial, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("25a6254bc6e9484da214a25e5776ba62")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrinting3DMultiplePropertyMaterial(ptr: Pointer?): WithDefault =
        IPrinting3DMultiplePropertyMaterial_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrinting3DMultiplePropertyMaterial {
      val address = segment.toRawLongValue()
      return makeIPrinting3DMultiplePropertyMaterial(Pointer(address))
    }

    public override fun toNative(obj: IPrinting3DMultiplePropertyMaterial): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1842588515_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrinting3DMultiplePropertyMaterial):
        Array<IPrinting3DMultiplePropertyMaterial?> = (elements as
        Array<IPrinting3DMultiplePropertyMaterial?>).castToImpl<IPrinting3DMultiplePropertyMaterial,IPrinting3DMultiplePropertyMaterial_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrinting3DMultiplePropertyMaterial?> =
        arrayOfNulls<IPrinting3DMultiplePropertyMaterial_Impl>(size) as
        Array<IPrinting3DMultiplePropertyMaterial?>
  }
}
