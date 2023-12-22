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

@ABIMarker(IPrinting3DColorMaterialGroup.ABI::class)
@Signature("{001a6bd0-aadf-4226-afe9-f369a0b45004}")
@Guid("001a6bd0aadf4226afe9f369a0b45004")
@WinRTInterface("001a6bd0aadf4226afe9f369a0b45004")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrinting3DColorMaterialGroup.ByReference::class)
public interface IPrinting3DColorMaterialGroup : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Colors(): IVector<Printing3DColorMaterial?>?

  @InterfaceMethod(1)
  public fun get_MaterialGroupId(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrinting3DColorMaterialGroup> {
    public override fun getValue() = ABI.makeIPrinting3DColorMaterialGroup(pointer.getPointer(0))

    public fun setValue(value: IPrinting3DColorMaterialGroup_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrinting3DColorMaterialGroup {
    public val __625701894_Ptr: Pointer?

    public val _625701894_VtblPtr: Pointer?
      get() = __625701894_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Colors(): IVector<Printing3DColorMaterial?>? {
      val fnPtr = _625701894_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<Printing3DColorMaterial?>>()
      val hr = fn.invokeHR(arrayOf(__625701894_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<Printing3DColorMaterial?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_MaterialGroupId(): WinDef.UINT {
      val fnPtr = _625701894_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__625701894_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IPrinting3DColorMaterialGroup_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __625701894_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrinting3DColorMaterialGroup, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("001a6bd0aadf4226afe9f369a0b45004")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrinting3DColorMaterialGroup(ptr: Pointer?): WithDefault =
        IPrinting3DColorMaterialGroup_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrinting3DColorMaterialGroup {
      val address = segment.toRawLongValue()
      return makeIPrinting3DColorMaterialGroup(Pointer(address))
    }

    public override fun toNative(obj: IPrinting3DColorMaterialGroup): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__625701894_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrinting3DColorMaterialGroup):
        Array<IPrinting3DColorMaterialGroup?> = (elements as
        Array<IPrinting3DColorMaterialGroup?>).castToImpl<IPrinting3DColorMaterialGroup,IPrinting3DColorMaterialGroup_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrinting3DColorMaterialGroup?> =
        arrayOfNulls<IPrinting3DColorMaterialGroup_Impl>(size) as
        Array<IPrinting3DColorMaterialGroup?>
  }
}
