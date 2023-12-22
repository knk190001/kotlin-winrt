package Windows.ApplicationModel.DataTransfer

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ShareUIOptions.ABI::class)
@Signature("rc(Windows.ApplicationModel.DataTransfer.ShareUIOptions;{72fa8a80-342f-4d90-9551-2ae04e37680c})")
@WinRTByReference(brClass = ShareUIOptions.ByReference::class)
public class ShareUIOptions(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IShareUIOptions.WithDefault, IWinRTObject {
  private val __93469621_Interface: IShareUIOptions.WithDefault by lazy {
    as_93469621()
  }


  public override val __93469621_Ptr: JNAPointer? by lazy {
    __93469621_Interface.__93469621_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__93469621_Interface)

  public constructor() : this(ABI.activate())

  private fun as_93469621(): IShareUIOptions.WithDefault {
    if(pointer == NULL) {
      return(IShareUIOptions.ABI.makeIShareUIOptions(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IShareUIOptions>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IShareUIOptions.ABI.makeIShareUIOptions(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ShareUIOptions>
      {
    public override fun getValue() = ShareUIOptions(pointer.getPointer(0))

    public fun setValue(value: ShareUIOptions): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ShareUIOptions, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.DataTransfer.ShareUIOptions".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public override fun fromNative(segment: MemoryAddress): ShareUIOptions {
      val address = segment.toRawLongValue()
      return ShareUIOptions(Pointer(address))
    }

    public override fun toNative(obj: ShareUIOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
