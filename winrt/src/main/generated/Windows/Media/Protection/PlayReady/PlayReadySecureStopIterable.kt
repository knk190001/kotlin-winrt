package Windows.Media.Protection.PlayReady

import Windows.Foundation.Collections.IIterable
import Windows.Media.Protection.PlayReady.IPlayReadySecureStopIterableFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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
import kotlin.Byte
import kotlin.Unit
import kotlin.reflect.KType
import kotlin.reflect.typeOf

@ABIMarker(PlayReadySecureStopIterable.ABI::class)
@Signature("rc(Windows.Media.Protection.PlayReady.PlayReadySecureStopIterable;pinterface({faa585ea-6214-4217-afda-7f46de5869b3};{b5501ee5-01bf-4401-9677-05630a6a4cc8}))")
@WinRTByReference(brClass = PlayReadySecureStopIterable.ByReference::class)
public class PlayReadySecureStopIterable(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IIterable<IPlayReadySecureStopServiceRequest?>, IWinRTObject {
  private val __1449643190_Interface: IIterable<IPlayReadySecureStopServiceRequest?> by lazy {
    as_1449643190()
  }


  public override val __1449643190_Type: KType =
      typeOf<IIterable<IPlayReadySecureStopServiceRequest?>>()

  public override val __1449643190_Ptr: JNAPointer? by lazy {
    __1449643190_Interface.__1449643190_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1449643190_Interface)

  public constructor(publisherCertBytes: Array<Byte>) : this(ABI.activate(publisherCertBytes))

  private fun as_1449643190(): IIterable<IPlayReadySecureStopServiceRequest?> {
    if(pointer == NULL) {
      return(IIterable.ABI.makeIIterable<IPlayReadySecureStopServiceRequest?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIterable<IPlayReadySecureStopServiceRequest?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIterable.ABI.makeIIterable<IPlayReadySecureStopServiceRequest?>(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PlayReadySecureStopIterable> {
    public override fun getValue() = PlayReadySecureStopIterable(pointer.getPointer(0))

    public fun setValue(value: PlayReadySecureStopIterable): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PlayReadySecureStopIterable, MemoryAddress> {
    public val IPlayReadySecureStopIterableFactory_Instance: IPlayReadySecureStopIterableFactory by
        lazy {
      createIPlayReadySecureStopIterableFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPlayReadySecureStopIterableFactory(): IPlayReadySecureStopIterableFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Protection.PlayReady.PlayReadySecureStopIterable".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IPlayReadySecureStopIterableFactory.ABI.makeIPlayReadySecureStopIterableFactory(factoryActivatorPtr.value))
    }

    public fun activate(publisherCertBytes: Array<Byte>): JNAPointer? =
        IPlayReadySecureStopIterableFactory_Instance.CreateInstance(publisherCertBytes)?.pointer

    public override fun fromNative(segment: MemoryAddress): PlayReadySecureStopIterable {
      val address = segment.toRawLongValue()
      return PlayReadySecureStopIterable(Pointer(address))
    }

    public override fun toNative(obj: PlayReadySecureStopIterable): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
