package Windows.ApplicationModel.DataTransfer

import Windows.Storage.Streams.RandomAccessStreamReference
import Windows.UI.Color
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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IShareProviderFactory.ABI::class)
@Signature("{172a174c-e79e-4f6d-b07d-128f469e0296}")
@Guid("172a174ce79e4f6db07d128f469e0296")
@WinRTInterface("172a174ce79e4f6db07d128f469e0296")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IShareProviderFactory.ByReference::class)
public interface IShareProviderFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(
    title: String?,
    displayIcon: RandomAccessStreamReference?,
    backgroundColor: Color?,
    handler: ShareProviderHandler?
  ): ShareProvider?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IShareProviderFactory> {
    public override fun getValue() = ABI.makeIShareProviderFactory(pointer.getPointer(0))

    public fun setValue(value: IShareProviderFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IShareProviderFactory {
    public val __124425276_Ptr: Pointer?

    public val _124425276_VtblPtr: Pointer?
      get() = __124425276_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(
      title: String?,
      displayIcon: RandomAccessStreamReference?,
      backgroundColor: Color?,
      handler: ShareProviderHandler?
    ): ShareProvider? {
      val fnPtr = _124425276_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ShareProvider>()
      val hr = fn.invokeHR(arrayOf(__124425276_Ptr, marshalToNative(title),
          marshalToNative(displayIcon), marshalToNative(backgroundColor), marshalToNative(handler),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ShareProvider>(result.getValue())
      return resultValue
    }
  }

  public class IShareProviderFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __124425276_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IShareProviderFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("172a174ce79e4f6db07d128f469e0296")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIShareProviderFactory(ptr: Pointer?): WithDefault =
        IShareProviderFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IShareProviderFactory {
      val address = segment.toRawLongValue()
      return makeIShareProviderFactory(Pointer(address))
    }

    public override fun toNative(obj: IShareProviderFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__124425276_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IShareProviderFactory): Array<IShareProviderFactory?> =
        (elements as
        Array<IShareProviderFactory?>).castToImpl<IShareProviderFactory,IShareProviderFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IShareProviderFactory?> =
        arrayOfNulls<IShareProviderFactory_Impl>(size) as Array<IShareProviderFactory?>
  }
}
