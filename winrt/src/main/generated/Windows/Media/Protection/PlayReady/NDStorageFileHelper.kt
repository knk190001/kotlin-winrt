package Windows.Media.Protection.PlayReady

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

@ABIMarker(NDStorageFileHelper.ABI::class)
@Signature("rc(Windows.Media.Protection.PlayReady.NDStorageFileHelper;{d8f0bef8-91d2-4d47-a3f9-eaff4edb729f})")
@WinRTByReference(brClass = NDStorageFileHelper.ByReference::class)
public class NDStorageFileHelper(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), INDStorageFileHelper.WithDefault, IWinRTObject {
  private val __736056843_Interface: INDStorageFileHelper.WithDefault by lazy {
    as_736056843()
  }


  public override val __736056843_Ptr: JNAPointer? by lazy {
    __736056843_Interface.__736056843_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__736056843_Interface)

  public constructor() : this(ABI.activate())

  private fun as_736056843(): INDStorageFileHelper.WithDefault {
    if(pointer == NULL) {
      return(INDStorageFileHelper.ABI.makeINDStorageFileHelper(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INDStorageFileHelper>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INDStorageFileHelper.ABI.makeINDStorageFileHelper(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<NDStorageFileHelper> {
    public override fun getValue() = NDStorageFileHelper(pointer.getPointer(0))

    public fun setValue(value: NDStorageFileHelper): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NDStorageFileHelper, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Protection.PlayReady.NDStorageFileHelper".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): NDStorageFileHelper {
      val address = segment.toRawLongValue()
      return NDStorageFileHelper(Pointer(address))
    }

    public override fun toNative(obj: NDStorageFileHelper): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
