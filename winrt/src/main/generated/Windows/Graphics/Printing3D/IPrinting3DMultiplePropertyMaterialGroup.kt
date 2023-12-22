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

@ABIMarker(IPrinting3DMultiplePropertyMaterialGroup.ABI::class)
@Signature("{f0950519-aeb9-4515-a39b-a088fbbb277c}")
@Guid("f0950519aeb94515a39ba088fbbb277c")
@WinRTInterface("f0950519aeb94515a39ba088fbbb277c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrinting3DMultiplePropertyMaterialGroup.ByReference::class)
public interface IPrinting3DMultiplePropertyMaterialGroup : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MultipleProperties(): IVector<Printing3DMultiplePropertyMaterial?>?

  @InterfaceMethod(1)
  public fun get_MaterialGroupIndices(): IVector<WinDef.UINT>?

  @InterfaceMethod(2)
  public fun get_MaterialGroupId(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrinting3DMultiplePropertyMaterialGroup> {
    public override fun getValue() =
        ABI.makeIPrinting3DMultiplePropertyMaterialGroup(pointer.getPointer(0))

    public fun setValue(value: IPrinting3DMultiplePropertyMaterialGroup_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrinting3DMultiplePropertyMaterialGroup {
    public val __1349454818_Ptr: Pointer?

    public val _1349454818_VtblPtr: Pointer?
      get() = __1349454818_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MultipleProperties(): IVector<Printing3DMultiplePropertyMaterial?>? {
      val fnPtr = _1349454818_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<Printing3DMultiplePropertyMaterial?>>()
      val hr = fn.invokeHR(arrayOf(__1349454818_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVector<Printing3DMultiplePropertyMaterial?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_MaterialGroupIndices(): IVector<WinDef.UINT>? {
      val fnPtr = _1349454818_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__1349454818_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_MaterialGroupId(): WinDef.UINT {
      val fnPtr = _1349454818_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1349454818_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IPrinting3DMultiplePropertyMaterialGroup_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1349454818_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrinting3DMultiplePropertyMaterialGroup, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f0950519aeb94515a39ba088fbbb277c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrinting3DMultiplePropertyMaterialGroup(ptr: Pointer?): WithDefault =
        IPrinting3DMultiplePropertyMaterialGroup_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IPrinting3DMultiplePropertyMaterialGroup {
      val address = segment.toRawLongValue()
      return makeIPrinting3DMultiplePropertyMaterialGroup(Pointer(address))
    }

    public override fun toNative(obj: IPrinting3DMultiplePropertyMaterialGroup): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1349454818_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrinting3DMultiplePropertyMaterialGroup):
        Array<IPrinting3DMultiplePropertyMaterialGroup?> = (elements as
        Array<IPrinting3DMultiplePropertyMaterialGroup?>).castToImpl<IPrinting3DMultiplePropertyMaterialGroup,IPrinting3DMultiplePropertyMaterialGroup_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrinting3DMultiplePropertyMaterialGroup?> =
        arrayOfNulls<IPrinting3DMultiplePropertyMaterialGroup_Impl>(size) as
        Array<IPrinting3DMultiplePropertyMaterialGroup?>
  }
}
