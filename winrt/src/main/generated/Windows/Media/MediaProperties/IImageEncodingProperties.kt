package Windows.Media.MediaProperties

import Windows.Media.MediaProperties.IMediaEncodingProperties.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
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
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IImageEncodingProperties.ABI::class)
@Signature("{78625635-f331-4189-b1c3-b48d5ae034f1}")
@Guid("78625635f3314189b1c3b48d5ae034f1")
@WinRTInterface("78625635f3314189b1c3b48d5ae034f1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IImageEncodingProperties.ByReference::class)
public interface IImageEncodingProperties : NativeMapped, IWinRTInterface, IMediaEncodingProperties
    {
  @InterfaceMethod(0)
  public fun put_Width(value: WinDef.UINT): Unit

  @InterfaceMethod(1)
  public fun get_Width(): WinDef.UINT

  @InterfaceMethod(2)
  public fun put_Height(value: WinDef.UINT): Unit

  @InterfaceMethod(3)
  public fun get_Height(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IImageEncodingProperties> {
    public override fun getValue() = ABI.makeIImageEncodingProperties(pointer.getPointer(0))

    public fun setValue(value: IImageEncodingProperties_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IImageEncodingProperties, IMediaEncodingProperties.WithDefault {
    public val __1708040262_Ptr: Pointer?

    public val _1708040262_VtblPtr: Pointer?
      get() = __1708040262_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_Width(value: WinDef.UINT): Unit {
      val fnPtr = _1708040262_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1708040262_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_Width(): WinDef.UINT {
      val fnPtr = _1708040262_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1708040262_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_Height(value: WinDef.UINT): Unit {
      val fnPtr = _1708040262_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1708040262_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_Height(): WinDef.UINT {
      val fnPtr = _1708040262_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1708040262_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IImageEncodingProperties_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IMediaEncodingProperties {
    public override val __1294923267_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1708040262_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1708040262_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IImageEncodingProperties, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("78625635f3314189b1c3b48d5ae034f1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIImageEncodingProperties(ptr: Pointer?): WithDefault =
        IImageEncodingProperties_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IImageEncodingProperties {
      val address = segment.toRawLongValue()
      return makeIImageEncodingProperties(Pointer(address))
    }

    public override fun toNative(obj: IImageEncodingProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1708040262_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IImageEncodingProperties):
        Array<IImageEncodingProperties?> = (elements as
        Array<IImageEncodingProperties?>).castToImpl<IImageEncodingProperties,IImageEncodingProperties_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IImageEncodingProperties?> =
        arrayOfNulls<IImageEncodingProperties_Impl>(size) as Array<IImageEncodingProperties?>
  }
}
