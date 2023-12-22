package Windows.Media.MediaProperties

import Windows.Media.MediaProperties.IMediaEncodingProperties.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IContainerEncodingProperties.ABI::class)
@Signature("{59ac2a57-b32a-479e-8a61-4b7f2e9e7ea0}")
@Guid("59ac2a57b32a479e8a614b7f2e9e7ea0")
@WinRTInterface("59ac2a57b32a479e8a614b7f2e9e7ea0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContainerEncodingProperties.ByReference::class)
public interface IContainerEncodingProperties : NativeMapped, IWinRTInterface,
    IMediaEncodingProperties {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContainerEncodingProperties> {
    public override fun getValue() = ABI.makeIContainerEncodingProperties(pointer.getPointer(0))

    public fun setValue(value: IContainerEncodingProperties_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContainerEncodingProperties, IMediaEncodingProperties.WithDefault
      {
    public val __897052448_Ptr: Pointer?

    public val _897052448_VtblPtr: Pointer?
      get() = __897052448_Ptr?.getPointer(0)
  }

  public class IContainerEncodingProperties_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IMediaEncodingProperties {
    public override val __1294923267_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_897052448_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __897052448_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContainerEncodingProperties, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("59ac2a57b32a479e8a614b7f2e9e7ea0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContainerEncodingProperties(ptr: Pointer?): WithDefault =
        IContainerEncodingProperties_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContainerEncodingProperties {
      val address = segment.toRawLongValue()
      return makeIContainerEncodingProperties(Pointer(address))
    }

    public override fun toNative(obj: IContainerEncodingProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__897052448_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContainerEncodingProperties):
        Array<IContainerEncodingProperties?> = (elements as
        Array<IContainerEncodingProperties?>).castToImpl<IContainerEncodingProperties,IContainerEncodingProperties_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContainerEncodingProperties?> =
        arrayOfNulls<IContainerEncodingProperties_Impl>(size) as
        Array<IContainerEncodingProperties?>
  }
}
