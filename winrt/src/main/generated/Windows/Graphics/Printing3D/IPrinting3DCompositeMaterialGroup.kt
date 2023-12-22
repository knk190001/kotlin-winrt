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

@ABIMarker(IPrinting3DCompositeMaterialGroup.ABI::class)
@Signature("{8d946a5b-40f1-496d-a5fb-340a5a678e30}")
@Guid("8d946a5b40f1496da5fb340a5a678e30")
@WinRTInterface("8d946a5b40f1496da5fb340a5a678e30")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrinting3DCompositeMaterialGroup.ByReference::class)
public interface IPrinting3DCompositeMaterialGroup : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Composites(): IVector<Printing3DCompositeMaterial?>?

  @InterfaceMethod(1)
  public fun get_MaterialGroupId(): WinDef.UINT

  @InterfaceMethod(2)
  public fun get_MaterialIndices(): IVector<WinDef.UINT>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrinting3DCompositeMaterialGroup> {
    public override fun getValue() =
        ABI.makeIPrinting3DCompositeMaterialGroup(pointer.getPointer(0))

    public fun setValue(value: IPrinting3DCompositeMaterialGroup_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrinting3DCompositeMaterialGroup {
    public val __1261533922_Ptr: Pointer?

    public val _1261533922_VtblPtr: Pointer?
      get() = __1261533922_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Composites(): IVector<Printing3DCompositeMaterial?>? {
      val fnPtr = _1261533922_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<Printing3DCompositeMaterial?>>()
      val hr = fn.invokeHR(arrayOf(__1261533922_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<Printing3DCompositeMaterial?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_MaterialGroupId(): WinDef.UINT {
      val fnPtr = _1261533922_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1261533922_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_MaterialIndices(): IVector<WinDef.UINT>? {
      val fnPtr = _1261533922_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__1261533922_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<WinDef.UINT>>(result.getValue())
      return resultValue
    }
  }

  public class IPrinting3DCompositeMaterialGroup_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1261533922_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrinting3DCompositeMaterialGroup, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8d946a5b40f1496da5fb340a5a678e30")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrinting3DCompositeMaterialGroup(ptr: Pointer?): WithDefault =
        IPrinting3DCompositeMaterialGroup_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrinting3DCompositeMaterialGroup {
      val address = segment.toRawLongValue()
      return makeIPrinting3DCompositeMaterialGroup(Pointer(address))
    }

    public override fun toNative(obj: IPrinting3DCompositeMaterialGroup): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1261533922_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrinting3DCompositeMaterialGroup):
        Array<IPrinting3DCompositeMaterialGroup?> = (elements as
        Array<IPrinting3DCompositeMaterialGroup?>).castToImpl<IPrinting3DCompositeMaterialGroup,IPrinting3DCompositeMaterialGroup_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrinting3DCompositeMaterialGroup?> =
        arrayOfNulls<IPrinting3DCompositeMaterialGroup_Impl>(size) as
        Array<IPrinting3DCompositeMaterialGroup?>
  }
}
