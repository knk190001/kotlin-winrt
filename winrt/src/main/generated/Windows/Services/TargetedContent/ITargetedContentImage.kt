package Windows.Services.TargetedContent

import Windows.Storage.Streams.IRandomAccessStreamReference
import Windows.Storage.Streams.IRandomAccessStreamReference.ABI.IID
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

@ABIMarker(ITargetedContentImage.ABI::class)
@Signature("{a7a585d9-779f-4b1e-bbb1-8eaf53fbeab2}")
@Guid("a7a585d9779f4b1ebbb18eaf53fbeab2")
@WinRTInterface("a7a585d9779f4b1ebbb18eaf53fbeab2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITargetedContentImage.ByReference::class)
public interface ITargetedContentImage : NativeMapped, IWinRTInterface, IRandomAccessStreamReference
    {
  @InterfaceMethod(0)
  public fun get_Height(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_Width(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITargetedContentImage> {
    public override fun getValue() = ABI.makeITargetedContentImage(pointer.getPointer(0))

    public fun setValue(value: ITargetedContentImage_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITargetedContentImage, IRandomAccessStreamReference.WithDefault {
    public val __1814453545_Ptr: Pointer?

    public val _1814453545_VtblPtr: Pointer?
      get() = __1814453545_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Height(): WinDef.UINT {
      val fnPtr = _1814453545_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1814453545_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Width(): WinDef.UINT {
      val fnPtr = _1814453545_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1814453545_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class ITargetedContentImage_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IRandomAccessStreamReference {
    public override val __1417919440_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1814453545_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1814453545_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITargetedContentImage, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a7a585d9779f4b1ebbb18eaf53fbeab2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITargetedContentImage(ptr: Pointer?): WithDefault =
        ITargetedContentImage_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITargetedContentImage {
      val address = segment.toRawLongValue()
      return makeITargetedContentImage(Pointer(address))
    }

    public override fun toNative(obj: ITargetedContentImage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1814453545_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITargetedContentImage): Array<ITargetedContentImage?> =
        (elements as
        Array<ITargetedContentImage?>).castToImpl<ITargetedContentImage,ITargetedContentImage_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITargetedContentImage?> =
        arrayOfNulls<ITargetedContentImage_Impl>(size) as Array<ITargetedContentImage?>
  }
}
