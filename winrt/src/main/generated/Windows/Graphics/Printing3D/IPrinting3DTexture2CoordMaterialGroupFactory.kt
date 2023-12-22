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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPrinting3DTexture2CoordMaterialGroupFactory.ABI::class)
@Signature("{cbb049b0-468a-4c6f-b2a2-8eb8ba8dea48}")
@Guid("cbb049b0468a4c6fb2a28eb8ba8dea48")
@WinRTInterface("cbb049b0468a4c6fb2a28eb8ba8dea48")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrinting3DTexture2CoordMaterialGroupFactory.ByReference::class)
public interface IPrinting3DTexture2CoordMaterialGroupFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(MaterialGroupId: WinDef.UINT): Printing3DTexture2CoordMaterialGroup?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrinting3DTexture2CoordMaterialGroupFactory> {
    public override fun getValue() =
        ABI.makeIPrinting3DTexture2CoordMaterialGroupFactory(pointer.getPointer(0))

    public fun setValue(value: IPrinting3DTexture2CoordMaterialGroupFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrinting3DTexture2CoordMaterialGroupFactory {
    public val __927278847_Ptr: Pointer?

    public val _927278847_VtblPtr: Pointer?
      get() = __927278847_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(MaterialGroupId: WinDef.UINT):
        Printing3DTexture2CoordMaterialGroup? {
      val fnPtr = _927278847_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Printing3DTexture2CoordMaterialGroup>()
      val hr = fn.invokeHR(arrayOf(__927278847_Ptr, MaterialGroupId, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Printing3DTexture2CoordMaterialGroup>(result.getValue())
      return resultValue
    }
  }

  public class IPrinting3DTexture2CoordMaterialGroupFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __927278847_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrinting3DTexture2CoordMaterialGroupFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cbb049b0468a4c6fb2a28eb8ba8dea48")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrinting3DTexture2CoordMaterialGroupFactory(ptr: Pointer?): WithDefault =
        IPrinting3DTexture2CoordMaterialGroupFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IPrinting3DTexture2CoordMaterialGroupFactory {
      val address = segment.toRawLongValue()
      return makeIPrinting3DTexture2CoordMaterialGroupFactory(Pointer(address))
    }

    public override fun toNative(obj: IPrinting3DTexture2CoordMaterialGroupFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__927278847_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrinting3DTexture2CoordMaterialGroupFactory):
        Array<IPrinting3DTexture2CoordMaterialGroupFactory?> = (elements as
        Array<IPrinting3DTexture2CoordMaterialGroupFactory?>).castToImpl<IPrinting3DTexture2CoordMaterialGroupFactory,IPrinting3DTexture2CoordMaterialGroupFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrinting3DTexture2CoordMaterialGroupFactory?> =
        arrayOfNulls<IPrinting3DTexture2CoordMaterialGroupFactory_Impl>(size) as
        Array<IPrinting3DTexture2CoordMaterialGroupFactory?>
  }
}
